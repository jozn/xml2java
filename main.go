package main

import (
	"bytes"
	"encoding/xml"
	"fmt"
	"github.com/alexflint/go-arg"
	"io/ioutil"
	"log"
	"os"
	"path"
	"strings"
	"text/template"
	"unicode"
)

//todo: maybe could use <include /> the way that if it has id, then look at that layout and instead of inline
//find it's ids ,just use the name of layout to it class in the X class (must not be merge layout)
//maybe this is overkill and better to use compound view in this case

type argsConf struct {
	PACKAGE        string `arg:"positional,-p,help:app package name (ex: com.example.hello)"`
	APP_DIR        string `arg:"-a,help:android application project app path (default: current directory)"`
	XML_DIR        string `arg:"-x,help:app xml layout directory (default example 'src/main/res/layout')"`
	OUT_DIR        string `arg:"-o,help:directory to flush generated output (default example 'src/main/java/com/example/hello')"`
	OUT_CLASS_NAME string `arg:"-n,help:class name of generated output (default X)"`
}

type FieldView struct {
	ViewClass string
	Id        string `xml:"id,attr"`
	Layout    string `xml:"layout,attr"`
	XMLName   xml.Name
	Content   []byte       `xml:",innerxml"`
	Childes   []*FieldView `xml:",any"`
	ShouldSet bool
}

type CellView struct {
	FileName      string
	ClassName     string
	RootField     FieldView
	Fields        []*FieldView
	IsMergeLayout bool
	RootClass     string
}

type GenFile struct {
	Cells       []*CellView
	Imports     *Imports
	PackageName string
	ClassName   string
	OutClass    string
}

type Imports struct {
	AndroidViews map[string]bool
	OtherViews   map[string]bool
}

var genFile *GenFile

//there are many of Android views in android.view and android.widget for now just mass import them ("*")
//see: https://developer.android.com/reference/android/view/package-summary.html
//https://developer.android.com/reference/android/widget/package-summary.html
var notWidgets = map[string]bool{
	"include":      true,
	"merge":        true,
	"view":         true,
	"ViewGroup":    true,
	"fragment":     true,
	"requestFocus": true,
}

var args *argsConf

func main() {
	parseArgs()

	genFile = &GenFile{
		Imports:     &Imports{},
		ClassName:   args.OUT_CLASS_NAME,
		PackageName: args.PACKAGE,
	}

	xmls, err := ioutil.ReadDir(args.XML_DIR)
	if err != nil {
		panic(err)
	}

	for _, xml := range xmls {
		transformNewXmlFile(xml)
	}

	genFile.Gen()
}

func parseArgs() {
	args = &argsConf{}
	arg.MustParse(args)

	if args.PACKAGE == "" {
		log.Fatal("PACKAGE could not be empty. The first command line paramter is package name")
	}

	if args.APP_DIR == "" {
		wd, err := os.Getwd()
		noErr(err)
		args.APP_DIR = wd
	}

	if args.XML_DIR == "" {
		args.XML_DIR = path.Join(args.APP_DIR, "/src/main/res/layout/")
	}

	if args.OUT_DIR == "" {
		args.OUT_DIR = path.Join(args.APP_DIR, "/src/main/java", strings.Replace(args.PACKAGE, ".", "/", -1))
	}

	if args.OUT_CLASS_NAME == "" {
		args.OUT_CLASS_NAME = "X"
	}
}

func transformNewXmlFile(xmlF os.FileInfo) {
	data, err := ioutil.ReadFile(path.Join(args.XML_DIR, xmlF.Name()))
	noErr(err)
	buf := bytes.NewBuffer(data)
	dec := xml.NewDecoder(buf)
	var root FieldView
	err = dec.Decode(&root)
	noErr(err)

	fileName := strings.Replace(xmlF.Name(), ".xml", "", -1)
	cell := &CellView{
		FileName:  fileName,
		ClassName: ToCamel(fileName),
		RootField: root,
	}

	root.walkDown(cell, false)

	if len(cell.Fields) > 0 { //againest <merge/> tag
		if cell.IsMergeLayout {
			cell.RootClass = "ViewGroup"
		} else {
			cell.RootClass = cell.Fields[0].ViewClass
		}
		rootCls := cell.Fields[0].ViewClass
		if len(rootCls) > 0 { //not <merge /> xmls
			genFile.Cells = append(genFile.Cells, cell)
		}
	}
}

func (field *FieldView) walkDown(cell *CellView, isIncludeCall bool) {
	field.extractClassName()
	if unicode.IsLower(rune(field.ViewClass[0])) { //not <include /> tag
		//just we support include and merge tag of no View tags
		if field.XMLName.Local != "include" && field.XMLName.Local != "merge" {
			return
		}

		if field.XMLName.Local == "include" {
			addIncludeTag(field, cell)
		}
	}

	if field.XMLName.Local == "merge" && isIncludeCall == false {
		cell.IsMergeLayout = true
	}

	field.addFieldViewToCellView(cell)

	for _, child := range field.Childes {
		child.walkDown(cell, isIncludeCall)
	}
}

func (field *FieldView) addFieldViewToCellView(cell *CellView) {
	if field.XMLName.Local == "include" || field.XMLName.Local == "merge" {
		return
	}

	cell.Fields = append(cell.Fields, field)

	genFile.Imports.Add(field.XMLName.Local)

	if len(field.Id) > 0 {
		arr := strings.Split(field.Id, "/")
		field.Id = arr[1]
		field.ShouldSet = true
	}
	return
}

//todo extract xml reader
func addIncludeTag(include *FieldView, cell *CellView) {
	layout := stripRef(include.Layout)
	if layout == "" {
		return
	}
	data, err := ioutil.ReadFile(path.Join(args.XML_DIR, layout+".xml"))
	noErr(err)
	buf := bytes.NewBuffer(data)
	dec := xml.NewDecoder(buf)
	var root FieldView
	err = dec.Decode(&root)
	noErr(err)

	root.walkDown(cell, true)
}

//get Class name - ex: com.example.com.Avatar -> Avatar
func (field *FieldView) extractClassName() {
	clsDotIndex := strings.LastIndex(field.XMLName.Local, ".")
	if clsDotIndex == -1 {
		field.ViewClass = field.XMLName.Local
	} else {
		field.ViewClass = field.XMLName.Local[clsDotIndex+1:]
	}
}

func (i *Imports) Add(cls string) {
	index := strings.Index(cls, ".")
	if index > 0 {
		if i.OtherViews == nil {
			i.OtherViews = make(map[string]bool)
		}
		i.OtherViews[cls] = true
	} else {
		if i.AndroidViews == nil {
			i.AndroidViews = make(map[string]bool)
		}
		if _, ok := notWidgets[cls]; !ok {
			i.AndroidViews[cls] = true
		}
	}
}

func (g *GenFile) Gen() {
	for _, cell := range g.Cells {
		out := bytes.NewBufferString("")
		tmpl, err := template.New("t").Parse(TMPL_CELL)
		if err != nil {
			panic(err)
		}
		err = tmpl.Execute(out, cell)
		noErr(err)
		g.OutClass += out.String()
	}

	outFileBody := bytes.NewBufferString("")
	tmpl2, err := template.New("t2").Parse(TMPL_FILE)
	noErr(err)
	err = tmpl2.Execute(outFileBody, g)
	noErr(err)

	outJava := path.Join(args.OUT_DIR, args.OUT_CLASS_NAME+".java")

	//an optimization for taking advantage of faster build time
	oldWrite, err := ioutil.ReadFile(outJava)
	if err != nil || !bytes.Equal(outFileBody.Bytes(), oldWrite) {
		ioutil.WriteFile(outJava, outFileBody.Bytes(), 0666)
	}
}

//ex: @layout/titlebar => titlebar or @+id/my_text => my_text
func stripRef(ref string) string {
	arr := strings.Split(ref, "/")
	return arr[1]
}

func ToCamel(s string) string {
	s = strings.Trim(s, " ")
	s = strings.Replace(s, "__", "+", -1)
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
		case char == '_' || char == ' ':
			capNext = true
		case char == '+':
			strOut += string(char)
			capNext = true
		case char >= '0' && char <= '9':
			strOut += string(char) //for numbers,...
			capNext = false
		default:
			capNext = false
		}
	}

	strOut = strings.Replace(strOut, "+", "_", -1)
	return strOut
}

func noErr(err error) {
	if err != nil {
		panic(err)
	}
}

//old
func (field *FieldView) String() string {
	return fmt.Sprintf("%v %v %v \n", field.XMLName.Local, field.Id, field.ViewClass)
}

func (cell *CellView) String() string {
	s := fmt.Sprintf("%d \n", len(cell.Fields))
	for _, f := range cell.Fields {
		s += f.String()
	}

	return s
}

const TMPL_CELL = `
{{- $rootClass := .RootClass }}
    public static class {{ .ClassName }} {
        public {{ $rootClass }} root;
     {{- range .Fields -}}
      {{- if .ShouldSet}}
        public {{ .ViewClass }} {{ .Id -}};
      {{- end}}
     {{- end}}

        public {{ .ClassName }}(Context context,ViewGroup parent) {
            this(context,parent, R.layout.{{ .FileName }} );
        }

        public {{ .ClassName }}(Context context,ViewGroup parent, int layout) {
            {{- if  eq .IsMergeLayout  true}}
            root = ({{ $rootClass }}) LayoutInflater.from(context).inflate(layout,parent,true);//for Compound Views
            {{ else }}
            root = ({{ $rootClass }}) LayoutInflater.from(context).inflate(layout,parent ,false);
            {{- end}}
            {{- range .Fields -}}
              {{- if .ShouldSet}}
            {{ .Id }} = ( {{- .ViewClass -}} ) root.findViewById( R.id. {{- .Id -}} );
              {{- end}}
            {{- end}}
        }

        public {{ .ClassName }}(Context context) {
            this(context ,null);
        }

        public {{ .ClassName }}(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.{{ .FileName }};
            {{- range .Fields -}}
                {{- if .ShouldSet}}
            public static int {{.Id}} = R.id.{{- .Id -}};
                {{- end}}
            {{- end}}
        }
    }
`

const TMPL_FILE =
`//DON'T EDIT, THIS FILE IS AUTO GENERATED AND ALWAYS WILL BE SYNCED WITH 'layout/*.xml' FILES
//TO SYNC JUST REBUILD THE APP
//SEE THIS TOOL AT: https://github.com/jozn/xml2java

package {{.PackageName}};

import android.widget.*;
import android.view.*;
import android.webkit.WebView;
import android.view.LayoutInflater;
import android.content.Context;

{{- range $key, $val := .Imports.OtherViews }}
import {{ $key }};
{{- end }}
import {{.PackageName}}.R;

public class {{.ClassName}} {
    {{.OutClass}}
}

/////////////// manual imports /////////////////
/*
{{- range $key, $val := .Imports.AndroidViews }}
import android.widget.{{ $key }};
{{- end }}
*/
`
