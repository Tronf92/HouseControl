package com.example.housecontrol;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.ListAdapter;

public class MyAlertDialog extends Activity{
	final MyAlertDialog context = this;
	private Button btnYes;
	private Button btnCancel;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.custom_dialog);
		btnYes = (Button) findViewById(R.id.DialogButton);
		btnYes.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				startActivity(new Intent(android.provider.Settings.ACTION_SETTINGS));
				
			}
		});
		btnYes.setOnLongClickListener(new OnLongClickListener() {
			
			@Override
			public boolean onLongClick(View arg0) {
				Intent intent = new Intent(getApplicationContext(),ChooseConnectionDialog.class);
				startActivity(intent);
				return true;
			}
		});
		btnCancel =(Button) findViewById(R.id.DialogCancelButton);
		btnCancel.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.d("myapp", "click cancel");
				setResult(2);
				finish();
			}
		});
		
		
	}
}
