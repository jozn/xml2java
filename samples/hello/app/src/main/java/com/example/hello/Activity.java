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
