package com.codepath.example.croutondemo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import de.keyboardsurfer.android.widget.crouton.Configuration;
import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

public class CroutonMessageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_crouton_message);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.crouton_message, menu);
		return true;
	}

	public void onSimpleNotice(View v) {
		Crouton.showText(this, R.string.simple_text_message, Style.INFO);
	}

	public void onStyledNotice(View v) {
	    Configuration croutonConfiguration = new Configuration.Builder().setDuration(2500).build();
		Style style = new Style.Builder()
				.setBackgroundColorValue(Color.parseColor("#daffc0"))
				.setGravity(Gravity.CENTER_HORIZONTAL)
				.setConfiguration(croutonConfiguration)
				.setHeight(150)
				.setTextColorValue(Color.parseColor("#323a2c")).build();
		Crouton.showText(this, R.string.styled_text_message, style);
	}

	public void onCustomNotice(View v) {
		View customView = getLayoutInflater().inflate(R.layout.custom_crouton_layout, null);
		Crouton.show(this, customView);
	}

}
