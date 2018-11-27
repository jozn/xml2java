
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

/////////////// manual imports /////////////////
/*
import android.widget.TextView;
*/
