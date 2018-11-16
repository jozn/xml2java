# xml2java
Get ride of findViewById in android. Documentation and examples will soon be added.

This tool, autmaicly build a file X.java, in this file every laoyout in 
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
    tools:context=".MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"/>

</android.support.constraint.ConstraintLayout>
```

this tools will genrate `X.java`:
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

        public ActivityMain(Context context,ViewGroup parent) {
            this(context,parent, R.layout.activity_main );
        }

        public ActivityMain(Context context,ViewGroup parent, int layout) {
            root = (ConstraintLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
        }

        public ActivityMain(Context context) {
            this(context ,null);
        }

        public ActivityMain(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.activity_main;
        }
    }

}

/////////////// manual imports /////////////////
/*
import android.widget.TextView;
*/

```

for every layout `*.xml` file at lyout this tool will add an static class in `X.java`, every time that projects gets build this tool will sync all layouts with X claass.

### How to Install
You must install Golang, then in command line:

`go get github.com/jozn/xml2java`

then in app gradle file add this:

```java
task xml2javaTask(type: Exec)  {
    commandLine 'xml2java' , "com.example.hello"
}
build.dependsOn xml2javaTask

android {

    preBuild.dependsOn xml2javaTask
}
```

