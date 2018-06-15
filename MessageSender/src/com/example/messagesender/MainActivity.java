package com.example.messagesender;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener{

	private EditText ed_phonenum;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ed_phonenum = (EditText) findViewById(R.id.ed_phonenumber);
		EditText ed_msm = (EditText) findViewById(R.id.ed_message);
		Button btn_jia = (Button) findViewById(R.id.btn_getphonenum);
		Button btn_kuaijie = (Button) findViewById(R.id.btn_kuaijie);
		Button btn_send = (Button) findViewById(R.id.btn_send);
		btn_jia.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_getphonenum:
			Intent intent = new Intent(getApplicationContext(),ContactActivity.class);
			startActivity(intent);
			break;
		case R.id.btn_kuaijie:
			
			break;
		case R.id.btn_send:
			
			break;
		}
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		Log.w("返回数据", "data");
		switch (resultCode) {
		case 2:
			String phonenum = data.getStringExtra("number");
			ed_phonenum.setText(phonenum);
			break;

		default:
			break;
		}
	}
}
