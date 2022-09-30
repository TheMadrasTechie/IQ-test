 package com.example.iq_test;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Second extends Activity {
	RadioGroup radioGroup;
	RadioButton radioButton;
	Button button1;
	Context context=this;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
		button1=(Button)findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			int getid=radioGroup.getCheckedRadioButtonId();
			radioButton=(RadioButton)findViewById(getid);
			String answer=radioButton.getText().toString();
			if(answer.equals("mango"))
		
			{
				Toast.makeText(getApplicationContext(), "your answer is correct", Toast.LENGTH_SHORT).show();
			}
			else
 			{
				Toast.makeText(getApplicationContext(), "your answer is wrong", Toast.LENGTH_SHORT).show();
			}
			Toast.makeText(getApplicationContext(), "your answer is "+answer, Toast.LENGTH_SHORT).show();
			LayoutInflater li=LayoutInflater.from(context);
			View promptvView=li.inflate(R.layout.prompt, null);
			final AlertDialog.Builder alert=new AlertDialog.Builder(context);
			final EditText prompt_edit=(EditText)promptvView.findViewById(R.id.editText1);
			alert.setView(promptvView);
			alert.setCancelable(false);
			alert.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			});
			alert.setNeutralButton("remain in this page", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			});
			alert.setPositiveButton("move to next page", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
				Intent ss=new Intent(getApplicationContext(),Listview.class);
				startActivity(ss);
				}
			});
			AlertDialog ad=alert.create();
			ad.show();
			}
		});
	}
}