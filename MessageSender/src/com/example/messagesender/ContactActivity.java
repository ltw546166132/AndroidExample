package com.example.messagesender;

import java.util.ArrayList;
import java.util.List;

import com.example.messagesender.bean.Contact;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ContactActivity extends Activity{
	List<Contact> contacts = new ArrayList<Contact>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contact);
		ListView lv_contact = (ListView) findViewById(R.id.lv_contact);
		for(int i=0;i<20;i++) {
			Contact contact = new Contact();
			contact.setName("Name.."+i);
			contact.setPhonenumber("PhoneNumber..1389166666"+i);
			contacts.add(contact);
		}
		lv_contact.setAdapter(new MyAdpter());
		lv_contact.setOnItemClickListener(new OnItemClickListener() {
			
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//				TextView tv_name = (TextView) view.findViewById(R.id.tv_contact);
//				String name = tv_name.getText().toString();
				TextView tv_phonenum = (TextView) view.findViewById(R.id.tv_contactnum);
				String num = tv_phonenum.getText().toString();
				Log.w("PhoneNumber", num);
				Intent data = new Intent();
				data.putExtra("number",num);
				setResult(2, data);
				finish();
			}
		});
	}

	class MyAdpter extends BaseAdapter{

		@Override
		//返回ListView所需的Item数量
		public int getCount() {
			// TODO Auto-generated method stub
			return contacts.size();
		}
		//返回item对应的javabean
		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return contacts.get(position);
		}
		//返回第几个item
		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View view = null;
			if (convertView==null) {
				view = View.inflate(getApplicationContext(), R.layout.contactitem, null);
			} else {
				view = convertView;
			}
			TextView tv_contactname = (TextView) view.findViewById(R.id.tv_contact);
			TextView tv_contactnumber = (TextView) view.findViewById(R.id.tv_contactnum);
			tv_contactname.setText(contacts.get(position).getName());
			tv_contactnumber.setText(contacts.get(position).getPhonenumber());
			return view;
		}
		
	}

	
}