package com.spotilicious;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.GridView;
import android.widget.Toast;

public class spotilicious extends Activity {
	private CustomAdapter mAdapter;
	private ArrayList<String> mItems = new ArrayList<String>();
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		for (int i = 0; i<10; i++) {
			mItems.add(Integer.toString(i));
		}
	
		mAdapter = new CustomAdapter(this, mItems);
		GridView g = (GridView) findViewById(R.id.gridview);
		g.setAdapter(mAdapter);
		registerForContextMenu(g);
	}
	
	
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
		super.onCreateContextMenu(menu, v, menuInfo);
		menu.setHeaderTitle("Context Menu");
		AdapterContextMenuInfo cmi = (AdapterContextMenuInfo) menuInfo;
		menu.add(1, cmi.position, 0, "Action 1");
		menu.add(2, cmi.position, 0, "Action 2");
	}
	
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		GridView g = (GridView) findViewById(R.id.gridview);
		String s = (String) g.getItemAtPosition(item.getItemId());
		switch (item.getGroupId()) {
		case 1:
		Toast.makeText(this, "Action 1, Item "+s, Toast.LENGTH_SHORT).show();
		break;
		case 2:
		Toast.makeText(this, "Action 2, Item "+s, Toast.LENGTH_SHORT).show();
		break;
		}
		return true;
	}
}