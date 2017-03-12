package com.example.android;

import android.os.Bundle;

import javax.xml.transform.URIResolver;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView tv;
	private EditText fv1,fv2,fv3;
	private Button Btn;
	private String n,name,password;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv=(TextView)findViewById(R.id.textView1);
		fv1=(EditText)findViewById(R.id.editText1);
		fv2=(EditText)findViewById(R.id.editText2);
		fv3=(EditText)findViewById(R.id.editText3);
		Btn=(Button)findViewById(R.id.loginBtn);
		Btn.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				n=fv1.getText().toString();
				name=fv2.getText().toString();
				password=fv3.getText().toString();
				if(n.equals("14401190222")&&name.equals("xk")&&password.equals("14401190222"))
				{
					Intent intent=new Intent (MainActivity.this,Register.class);
					intent.putExtra("number", n);
					intent.putExtra("name", name);
					intent.putExtra("pwd", password);
					startActivityForResult(intent, 1);//¿ªÆôÐÂµÄactivity
					
				}
				else{
					
					
				}
				
			}
		});
		
	}
//	@Override
//	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//		// TODO Auto-generated method stub
//		super.onActivityResult(requestCode, resultCode, data);
//	
//		switch(requestCode){
//			case 1 :
//				if(resultCode==RESULT_OK){
//					Uri uri =data.getData();
//					tv.setText(uri.toString());
//					
//					
//				}
//		}
//			
//	}

}
