package com.example.housecontrol;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Settings extends TabActivity {
	private String tag= "myapp";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.settings_activity);
		Log.d(tag,"after setting the content");
		TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);


        TabSpec tab1 = tabHost.newTabSpec("General");
        TabSpec tab2 = tabHost.newTabSpec("Display");

       // Set the Tab name and Activity
       // that will be opened when particular Tab will be selected
        tab1.setIndicator("General");
        tab1.setContent(new Intent(this,Tab1Activity.class));
       
        tab2.setIndicator("Display");
        tab2.setContent(new Intent(this,Tab2Activity.class));

		try{
			tabHost.addTab(tab1);
			tabHost.addTab(tab2);
		}
		catch(Exception e){
			Log.d(tag,e.getMessage().toString());		}
		//getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.titlelayout);
	}

}
