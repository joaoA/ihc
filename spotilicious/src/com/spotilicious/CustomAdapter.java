package com.spotilicious;


import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class CustomAdapter extends BaseAdapter {
	private Context mContext;
	private ArrayList<String> mItems;
	public CustomAdapter(Context c, ArrayList<String> items) {
	mContext = c;
	mItems = items;
	}
	public int getCount() {
	return mItems.size();
	}
	public Object getItem(int position) {
	return mItems.get(position);
	}
	
	public long getItemId(int position) {
	return position;
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {
	View v = convertView;
	if (v == null) {
		LayoutInflater li = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		v = li.inflate(R.layout.grid_item, null);
		TextView tv = (TextView)v.findViewById(R.id.grid_item_text);
		tv.setText("Item #"+mItems.get(position));
		ImageView iv = (ImageView)v.findViewById(R.id.grid_item_image);
		switch (position) {
		case 0:
			iv.setImageResource(R.drawable.ic_launcher);
			break;
		case 1:
			iv.setImageResource(R.drawable.one);
			break;
		case 2:
			iv.setImageResource(R.drawable.two);
			break;
		case 3:
			iv.setImageResource(R.drawable.three);
			break;
		case 4:
			iv.setImageResource(R.drawable.four);
			break;
		case 5:
			iv.setImageResource(R.drawable.five);
			break;
		case 6:
			iv.setImageResource(R.drawable.six);
			break;
		
		}
	}
	return v;
	}
}