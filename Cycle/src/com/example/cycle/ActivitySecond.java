package com.example.cycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivitySecond extends Activity {
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
		setContentView(R.layout.activity_activity_second);
		System.out.println("onCreate2");
	}

	@Override
	protected void onStart() {
		
		super.onStart();
		System.out.println("onStart2");
	}
	
	@Override
	protected void onResume() {
		
		super.onResume();
		System.out.println("onResume2");
	}
	
	@Override
	protected void onPause() {
		
		super.onPause();
		System.out.println("onPause2");
	}
	
	@Override
	protected void onStop() {
		
		super.onStop();
		System.out.println("onStop2");
	}
	
	@Override
	protected void onRestart() {
		
		super.onRestart();
		System.out.println("onRestart2");
	}
	
	@Override
	protected void onDestroy() {
		
		super.onDestroy();
		System.out.println("onDestroy2");
	}
}
