package com.example.newactivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button callButton = (Button) findViewById(R.id.callphone);
		Button startsecond = (Button) findViewById(R.id.stratsecond);
		Button stratthird = (Button) findViewById(R.id.startthird);
		stratthird.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
//				Intent stsrtthird = new Intent(getApplicationContext(), SecondActivity.class);
//				startActivity(stsrtthird);
				Intent third = new Intent();
				third.setAction("com.ltw.secondview");
				startActivity(third);
//				Intent third = new Intent();
//				third.setClassName("com.example.myimageview", "com.example.myimageview.SecondView");
//				startActivity(third);
			}
		});
		startsecond.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startsecond();
			}
		});
		callButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				callPhone();
			}
		});
	}
	
	private void callPhone() {
		Intent call = new Intent();
		call.setAction(Intent.ACTION_CALL);
		call.setData(Uri.parse("tel:"+110));
		startActivity(call);
	}
	
	private void startsecond() {
		Intent startsecond = new Intent();
		startsecond.setAction("com.example.startsecond");
		startsecond.setData(Uri.parse("startsecond:"+123));
		startActivity(startsecond);
	}

}
