package com.twac.getphonenumber;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {
	private ListView lv;
	private MyAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		GetNum.getNum(this);
		lv = (ListView) findViewById(R.id.lv);
		adapter = new MyAdapter(GetNum.lists, this);
		lv.setAdapter(adapter);
	}

}
