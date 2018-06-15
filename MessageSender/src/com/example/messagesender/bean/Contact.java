package com.example.messagesender.bean;

public class Contact {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", phonenumber=" + phonenumber + "]";
	}
	private String name;
	private String phonenumber;
}
