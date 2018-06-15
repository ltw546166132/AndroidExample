package com.example.cycle;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
	public void openone(View v) {
		Intent intent = new Intent(this,MainActivity.class);
		startActivity(intent);
	}
	public void opentwo(View v) {
		Intent intent = new Intent(this,ActivitySecond.class);
		startActivity(intent);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		System.out.println("onCreate1");
		
	}
	
	@Override
	protected void onStart() {
		
		super.onStart();
		System.out.println("onStart1");
	}
	
	@Override
	protected void onResume() {
		
		super.onResume();
		System.out.println("onResume1");
	}
	
	@Override
	protected void onPause() {
		
		super.onPause();
		System.out.println("onPause1");
	}
	
	@Override
	protected void onStop() {
		
		super.onStop();
		System.out.println("onStop1");
	}
	
	@Override
	protected void onRestart() {
		
		super.onRestart();
		System.out.println("onRestart1");
	}
	
	@Override
	protected void onDestroy() {
		
		super.onDestroy();
		System.out.println("onDestroy1");
	}
	
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		
		super.onConfigurationChanged(newConfig);
		System.out.println("onConfigurationChanged1");
	}

}
