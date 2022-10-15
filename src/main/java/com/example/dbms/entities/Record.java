package com.example.dbms.entities;

import java.util.Date;

public class Record {
	private int user_id;
	private int house_id;
	private Date date;
	public Record() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Record(int user_id, int house_id, Date date) {
		super();
		this.user_id = user_id;
		this.house_id = house_id;
		this.date = date;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getHouse_id() {
		return house_id;
	}
	public void setHouse_id(int house_id) {
		this.house_id = house_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
