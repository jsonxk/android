package com.example.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends Activity{
	private TextView tv;
	private Button btn;
	private String name,pwd;
	@Override
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		Intent intent=this.getIntent();
		tv=(TextView)findViewById(R.id.register);
		tv.setText(intent.getStringExtra("number"));
		//name=intent.getStringExtra("name");
		//pwd=intent.getStringExtra("pwd");
		btn=(Button)findViewById(R.id.registerBtn);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Intent intent=new Intent (Register.this,MainActivity.class);
				//intent.putExtra("return", 1);
				//intent.putExtra("ne", name);
				//intent.putExtra("pd", pwd);
				//startActivity(intent);
				setResult(RESULT_CANCELED);
				finish();
			}
		});
	}
	
}
