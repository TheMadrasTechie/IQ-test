package com.example.iq_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final EditText et1 = (EditText) findViewById(R.id.editText1);
		final EditText et2 = (EditText) findViewById(R.id.editText2);
		final EditText et3 = (EditText) findViewById(R.id.editText3);
		final Button bt = (Button) findViewById(R.id.button1);
		bt.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String ne = et1.getText().toString();
				String phno = et2.getText().toString();
				String ps = et3.getText().toString();
				if (ps.equals(ne)) {
					Toast.makeText(getApplicationContext(), "you are a user",
							Toast.LENGTH_SHORT).show();
					Intent move = new Intent(MainActivity.this, First.class);
					move.putExtra("key", ne);
					move.putExtra("ky", phno);
					startActivity(move);
					
				} else {
					Toast.makeText(getApplicationContext(),
							"you are not a user", Toast.LENGTH_SHORT).show();
				}
			}
		});
	}

}
