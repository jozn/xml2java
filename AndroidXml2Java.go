package main

import (
	"bytes"
	"encoding/xml"
	"fmt"
	"strings"
    "text/template"
    "os"
    "io/ioutil"
    "unicode"
)

const XML_DIR = `D:\dev_working2\MS_Native\app\src\main\res\layout\`
//const XML_DIR = `D:\ME\_apks\Soroush0.14.4_\res\layout\`
//const XML_DIR = `D:\ME\_apks\com.facebook.katana_105.0.0.0.86-44450406_minAPI22\res\layout\`
const OUTPUT_DIR = `D:\dev_working2\MS_Native\app\src\main\java\com\mardomsara\social\`
const OUT_CLASS_NAME  = "GenViews"
const OUT_PACKAGE_NAME  = "com.mardomsara.social"

type FieldView struct {
    ViewClass string
    Id string `xml:"id,attr"`

    XMLName xml.Name
    Content []byte `xml:",innerxml"`
    Childs   []*FieldView `xml:",any"`
    ShouldSet bool
}

type CellView struct {
    FileName string
    ClassName string
    RootField FieldView
    Fields []*FieldView
}

type GenFile struct {
    Cells       []*CellView
    Imports     *Imports
    PackageName string
    ClassName   string
    OutClass string
}

type Imports struct {
    AndroidViews map[string]bool
    OtherViews map[string]bool
}

var genFile *GenFile

//there are many of Android views splited in android.view and android.widget for now just mass import them ("*")
//see: https://developer.android.com/reference/android/view/package-summary.html
//https://developer.android.com/reference/android/widget/package-summary.html
var notWigets = map[string]bool{
    "include" : true,
    "merge":true,
    "view":true,
    "ViewGroup":true,
    "fragment":true,
    "requestFocus":true,
}

func main() {
    genFile = &GenFile{
        Imports: &Imports{},
        ClassName: OUT_CLASS_NAME,
        PackageName: OUT_PACKAGE_NAME,
    }

    xmls,err:=ioutil.ReadDir(XML_DIR)
    if err!=nil{
        panic(err)
    }

    for _, xml :=range xmls{
        //fmt.Println(xml.Name())
        transformNewXmlFile(xml)
    }

    genFile.Gen()
}

func transformNewXmlFile(xmlF os.FileInfo) {
    data,err:= ioutil.ReadFile(XML_DIR + xmlF.Name())
    noErr(err)
    buf := bytes.NewBuffer(data)
    dec := xml.NewDecoder(buf)
    var root FieldView
    err = dec.Decode(&root)
    noErr(err)

    fileName:=strings.Replace(xmlF.Name(),".xml","",-1)
    cell := &CellView{
        FileName: fileName ,
        ClassName: ToCamel(fileName),
        RootField: root,
    }

    root.walkDown(cell)

    //fmt.Println("****")
    //fmt.Println(cell.String())
    //
    //tmpl,err :=template.New("t").Parse(TMPL_CELL)
    //if err!=nil {
    //    panic(err)
    //}
    //tmpl.Execute(os.Stdout,cell)

    if len(cell.Fields) > 0{
        rootCls := cell.Fields[0].ViewClass
        if len(rootCls) > 0 && unicode.IsUpper(rune(rootCls[0])) {//not <merge /> xmls
            genFile.Cells = append(genFile.Cells,cell)
        }
    }
}

func (field *FieldView) walkDown(cell *CellView) {
    field.extractClassName()
    if unicode.IsLower(rune(field.ViewClass[0])){//not <include /> tag
        return
    }
    cell.Fields = append(cell.Fields, field)
    field.processFieldView()
    for _, child := range field.Childs {
        child.walkDown(cell)
    }
}

func (field *FieldView ) processFieldView() bool{
    genFile.Imports.Add(field.XMLName.Local)

    if len(field.Id)>0 {
        arr:=strings.Split(field.Id,"/")
        field.Id= arr[1]
        field.ShouldSet = true
    }
    //fmt.Printf("%v %v %v \n",field.XMLName.Local,field.Id,field.ViewClass)
    return true
}

//get Class name - ex: com.mardomsara.com.Avatar -> Avatar
func (field *FieldView ) extractClassName(){
    clsDotIndex := strings.LastIndex(field.XMLName.Local,".")
    if clsDotIndex == -1 {
        field.ViewClass = field.XMLName.Local
    }else {
        field.ViewClass = field.XMLName.Local[clsDotIndex+1:]
    }
}

func (i *Imports) Add(cls string) {
    index:=strings.Index(cls,".")
    if index >0{
        if i.OtherViews == nil{
            i.OtherViews = make(map[string]bool)
        }
        i.OtherViews[cls]=true
    }else {
        if i.AndroidViews == nil{
            i.AndroidViews = make(map[string]bool)
        }
        if _,ok := notWigets[cls]; !ok{
            i.AndroidViews[cls]=true
        }
    }
}

func (g *GenFile) Gen() {
    for _,cell := range g.Cells {
        out := bytes.NewBufferString("")
        tmpl,err :=template.New("t").Parse(TMPL_CELL)
        if err!=nil {
            panic(err)
        }
        err = tmpl.Execute(out,cell)
        noErr(err)
        g.OutClass += out.String()
    }

    //fmt.Println(g.OutClass)
    outFileBody := bytes.NewBufferString("")
    tmpl2,err :=template.New("t2").Parse(TMPL_FILE)
    noErr(err)
    err =tmpl2.Execute(outFileBody,g)
    noErr(err)

    ioutil.WriteFile(OUTPUT_DIR+OUT_CLASS_NAME+".java",outFileBody.Bytes(),0666)
}

func ToCamel(s string) string {
    s = strings.Trim(s, " ")
    s = strings.Replace(s, "__","+",-1)
    strOut := ""
    capNext := true
    for _, char := range s {
        switch {
        case (char >= 'A' && char <= 'Z'):
            strOut += string(char)
            capNext = false
        case char >= 'a' && char <= 'z':
            if capNext {
                strOut += strings.ToUpper(string(char))
            } else {
                strOut += string(char)
            }
            capNext = false
        case char == '_'  || char == ' ':
            capNext = true
        case char == '+':
            strOut += string(char)
            capNext = true
        case char >= '0' && char <= '9':
            strOut += string(char)//for numbers,...
            capNext = false
        default:
            capNext = false
        }
    }

    strOut = strings.Replace(strOut, "+","_",-1)
    return strOut
}

func noErr(err error)  {
    if err!= nil{
        panic(err)
    }
}
//old
func (field *FieldView ) String() string{
    return fmt.Sprintf("%v %v %v \n",field.XMLName.Local,field.Id,field.ViewClass)
}

func (cell *CellView)String()string  {
    s := fmt.Sprintf("%d \n",len(cell.Fields))
    for _,f := range cell.Fields {
        s += f.String()
    }

    return s
}

const TMPL_CELL = `
{{- $rootClass := ( index .Fields 0).ViewClass }}

    public static class {{ .ClassName }} {
        public {{ $rootClass }} root;
     {{- range .Fields -}}
      {{- if .ShouldSet}}
        public {{ .ViewClass }} {{ .Id -}};
      {{- end}}
     {{- end}}

        public {{ .ClassName }}(ViewGroup parent) {
            root = ({{ $rootClass }}) AppUtil.inflate(R.layout.{{ .FileName }},parent);
            {{- range .Fields -}}
              {{- if .ShouldSet}}
            {{ .Id }} = ( {{- .ViewClass -}} ) root.findViewById( R.id. {{- .Id -}} );
              {{- end}}
            {{- end}}
        }

        public {{ .ClassName }}() {
            this(null);
        }
    }
`

const TMPL_FILE = `
package {{.PackageName}};

import android.widget.*;
import android.view.*;

{{ range $key, $val := .Imports.OtherViews }}
import {{ $key }};
{{- end }}

import com.mardomsara.social.helpers.AppUtil;

public class {{.ClassName}} {
    {{.OutClass}}
}

////////////////////////////////
{{- range $key, $val := .Imports.AndroidViews }}
//import android.widget.{{ $key }};
{{- end }}
`




