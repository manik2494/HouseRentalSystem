package com.example.dbms.entities;

public class bookmarked {
	
	private int user_id;
	
	private int house_id;

	public bookmarked() {
		super();
		// TODO Auto-generated constructor stub
	}

	public bookmarked(int user_id, int house_id) {
		super();
		this.user_id = user_id;
		this.house_id = house_id;
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
	
}
