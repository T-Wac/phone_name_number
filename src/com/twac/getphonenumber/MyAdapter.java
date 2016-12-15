package com.twac.getphonenumber;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
	private List<PhoneInfo> lists;
	private Context context;
	private LinearLayout layout;

	public MyAdapter(List<PhoneInfo> lists, Context context) {
		this.lists = lists;
		this.context = context;
	}

	@Override
	public int getCount() {

		return lists.size();
	}

	@Override
	public Object getItem(int position) {

		return lists.get(position);
	}

	@Override
	public long getItemId(int position) {

		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// LayoutInflater inflater = LayoutInflater.from(context);
		// layout = (LinearLayout) inflater.inflate(R.layout.cell, null);
		//
		// TextView tv_name = (TextView) layout.findViewById(R.id.text_name);
		// TextView tv_number = (TextView)
		// layout.findViewById(R.id.text_number);
		// tv_name.setText(lists.get(position).getName());
		// tv_number.setText(lists.get(position).getNumber());
		ViewHolder holder;
		if (convertView == null) {
			convertView = LayoutInflater.from(context).inflate(R.layout.cell,
					null);
			holder = new ViewHolder();
			holder.tv_name = (TextView) convertView
					.findViewById(R.id.text_name);
			holder.tv_number = (TextView) convertView
					.findViewById(R.id.text_number);
			holder.tv_name.setText(lists.get(position).getName());
			holder.tv_number.setText(lists.get(position).getNumber());
			convertView.setTag(holder);
		}
		else {
			holder=(ViewHolder) convertView.getTag();
			holder.tv_name.setText(lists.get(position).getName());
			holder.tv_number.setText(lists.get(position).getNumber());
		}
		return convertView;
	}

	public static class ViewHolder {
		TextView tv_name;
		TextView tv_number;
	}
}
