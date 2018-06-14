package com.example.screenlight;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ScreenBroadast extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		if(intent.getAction().equals("android.intent.action.SCREEN_ON")) {
			Log.w("屏幕开启", intent.getAction());
		}
		else if(intent.getAction().equals("android.intent.action.SCREEN_OFF")){
			Log.w("屏幕关闭", intent.getAction());
		}
	}
}
