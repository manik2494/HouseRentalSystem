package com.example.dbms.entities;

import java.util.Date;

public class appointment {
	
	private int user_id;
	
	private int house_id;
	
	private Date appoint_day;
	public appointment(int user_id, int house_id, Date appoint_day) {
		super();
		this.user_id = user_id;
		this.house_id = house_id;
		this.appoint_day = appoint_day;
	}
	public appointment() {
		super();
		// TODO Auto-generated constructor stub
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
	public Date getAppoint_day() {
		return appoint_day;
	}
	public void setAppoint_day(Date appoint_day) {
		this.appoint_day = appoint_day;
	}
}
