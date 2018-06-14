package com.example.screenlight;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends Activity {

	private BroadcastReceiver broadcast;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		broadcast = new ScreenBroadast();
		IntentFilter intentfilter = new IntentFilter();
		intentfilter.addAction("android.intent.action.SCREEN_ON");
		intentfilter.addAction("android.intent.action.SCREEN_OFF");
		registerReceiver(broadcast, intentfilter);
		
	}
	@Override
	protected void onDestroy() {
		
		super.onDestroy();
		unregisterReceiver(broadcast);
	}

}
