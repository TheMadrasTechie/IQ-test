package com.example.iq_test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class First extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first);
		Button bt1=(Button)findViewById(R.id.button1);
		bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Toast.makeText(getApplicationContext(), "your answer is wrong", Toast.LENGTH_SHORT).show();
			Intent nn = new Intent(First.this,Second.class);
			int mark=0;
			nn.putExtra("first_mark",mark);
			startActivity(nn);
			}
		});
		Button bt2=(Button)findViewById(R.id.button2);
		bt2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Toast.makeText(getApplicationContext(), "your answer is wrong", Toast.LENGTH_SHORT).show();	
			Intent nn = new Intent(First.this,Second.class);
			int mark=0;
			nn.putExtra("first_mark",mark);
			startActivity(nn);
			}
		});Button bt3=(Button)findViewById(R.id.button3);
		bt3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Toast.makeText(getApplicationContext(), "your answer is correct", Toast.LENGTH_SHORT).show();
			Intent nn = new Intent(First.this,Second.class);
			int mark=10;
			nn.putExtra("first_mark",mark);
			startActivity(nn);
			}
		});
		Button bt4=(Button)findViewById(R.id.button4);
		bt4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Toast.makeText(getApplicationContext(), "your answer is wrong", Toast.LENGTH_SHORT).show();
			Intent nn = new Intent(First.this,Second.class);
			int mark=0;
			nn.putExtra("first_mark",mark);
			startActivity(nn);
			}
		});
		
		
}
}