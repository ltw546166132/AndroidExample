package com.example.cycle;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class Mybroadcast extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		String action = intent.getAction();
		System.out.println("打电话广播监听->"+action);
	}

}
