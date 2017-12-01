package com.example.housecontrol;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ChooseConnectionDialog extends Activity {
	private String wifi = "WiFi";
	private String mb = "Mobile data";
	private ArrayList<String> listItems = new ArrayList<String>();
	private ArrayAdapter<String> adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.choose_connection_dialog);
		ListView listView = (ListView) findViewById(R.id.ConnectionOptions);
		adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listItems);
		adapter.add(wifi);
		adapter.add(mb);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			   @Override
			   public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
			      Object listItem = listView.getItemAtPosition(position);
			   } 
			});
	}
	
	public void  onListItemClick(ListView l, View v, int position, long id) {
		
	}
}
