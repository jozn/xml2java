# xml2java
Get rid of findViewById in android. Single source of trust of layout files, without reduncency of codes.

> **Unix philosophy**
>> Rule of Generation: Developers should avoid writing code by hand and instead write abstract high-level programs that generate code. This rule aims to reduce human errors and save time.

### A Glance of the Result of This Tool in Real Projects
For this layout files: https://github.com/jozn/xml2java/tree/master/samples/BigApp/app/src/main/res/layout

The generated output is:  https://github.com/jozn/xml2java/blob/master/samples/BigApp/app/src/main/java/com/example/big/bigapp/X.java


### How This Tool Works?
I demonstrate with an example for file `activity_main.xml` in `layout` directory:

```xml
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:id="@+id/my_constraint_layout"
    >

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        android:id="@+id/my_text_view"
        />

</android.support.constraint.ConstraintLayout>
```

this tools will generate `X.java`:
```java

package com.example.hello;

import android.widget.*;
import android.view.*;
import android.webkit.WebView;
import android.view.LayoutInflater;
import android.content.Context;
import android.support.constraint.ConstraintLayout;import com.example.hello.R;

public class X {
    
    public static class ActivityMain {
        public ConstraintLayout root;
        public ConstraintLayout my_constraint_layout;
        public TextView my_text_view;

        public ActivityMain(Context context,ViewGroup parent) {
            this(context,parent, R.layout.activity_main );
        }

        public ActivityMain(Context context,ViewGroup parent, int layout) {
            root = (ConstraintLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            my_constraint_layout = (ConstraintLayout) root.findViewById( R.id.my_constraint_layout);
            my_text_view = (TextView) root.findViewById( R.id.my_text_view);
        }

        public ActivityMain(Context context) {
            this(context ,null);
        }

        public ActivityMain(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.activity_main;
            public static int my_constraint_layout = R.id.my_constraint_layout;
            public static int my_text_view = R.id.my_text_view;
        }
    }

}

```

Then in your activates and fragments you can use this code:

```java
package com.example.hello;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class Activity extends AppCompatActivity {
	X.ActivityMain x;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		x = new X.ActivityMain(getApplicationContext());
		x.my_text_view.setText("Hi There!");
		
		setContentView(x.root);
	}

}

```


for every layout `*.xml` file at layout this tool will add an static class in `X.java`, every time that projects gets build this tool will sync all layouts with X class.

### How to Install
You must install Golang, then in command line:

`go get github.com/jozn/xml2java`

then in app gradle file add this:

```java
task xml2javaTask(type: Exec)  {
    commandLine 'xml2java' , "com.example.hello" //your app package name
}
build.dependsOn xml2javaTask

android {

    preBuild.dependsOn xml2javaTask
}
```
### See more command line option:
Use `xml2java -h` :
```
Usage: xml2java [--app_dir APP_DIR] [--xml_dir XML_DIR] [--out_dir OUT_DIR] [--out_class_name OUT_CLASS_NAME] PACKAGE

Positional arguments:
  PACKAGE                app package name (ex: com.example.hello)

Options:
  --app_dir APP_DIR, -a APP_DIR
                         android application project app path (default: current directory)
  --xml_dir XML_DIR, -x XML_DIR
                         app xml layout directory (default example 'src/main/res/layout')
  --out_dir OUT_DIR, -o OUT_DIR
                         directory to flush generated output (default example 'src/main/java/com/example/hello')
  --out_class_name OUT_CLASS_NAME, -n OUT_CLASS_NAME
                         class name of generated output (default X)
  --help, -h             display this help and exit
```

### FAQ:
#### What is the Philosophy of this tool:
The day that i build this tool, android databinding was not available. 
I build the main codes blocks of this tool in one night, after getting tired of waiting to new builds pushed to device and then crashed because of common error of cannot find id. this tool will obsolete this error and reduce a lot of boilerplate codes

#### How This compare to android databinding and butterknife?
This tool has near zero learning curve and  zero redundant codes. The only single source of trust is just files at `/layout/*.xml'.
Android databinding has learning curve and makes you to write logic code in xml files, something that is adapted from angluarjs.
butterknife has a lot of redundancy of codes.

#### Why it's written in Golang, and not common java and android-apt aproache?
I build this tool mainly for my project, but later i decided to open source this, maybe in future i write this tool in java.

#### Give me a real world usage:
See this real world file `X.java` output to make a scence of what this tool produce to make devloer life easy (output of old version) : [X.java](https://github.com/jozn/ms_native/blob/master/app/src/main/java/com/mardomsara/social/ui/X.java)
