package com.example.iq_test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Listview extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listview);
		final TextView tv=(TextView)findViewById(R.id.textView1);
		final Button bt=(Button)findViewById(R.id.button1);
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=getIntent();
				String name=i.getStringExtra("key");
				String phno=i.getStringExtra("key");
			Toast.makeText(getApplicationContext(), "we are calling"+name, Toast.LENGTH_SHORT).show();	
			}
		});
	}

	
}