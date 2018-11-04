
package com.example.hello;

import android.widget.*;
import android.view.*;
import android.webkit.WebView;
import android.view.LayoutInflater;
import android.content.Context;


import android.support.constraint.ConstraintLayout;

//import com.mardomsara.social.helpers.AppUtil;
import com.example.hello.R;

public class X {
    
    public static class ActivityMain {
        public ConstraintLayout root;

        public ActivityMain(Context context,ViewGroup parent) {
            this(context,parent, R.layout.activity_main );
        }

        public ActivityMain(Context context,ViewGroup parent, int layout) {
            root = (ConstraintLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
        }
        /*public ActivityMain() {
            this(AppUtil.getContext(),null);
        }*/

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

////////////////////////////////
/*
import android.widget.TextView;
*/
