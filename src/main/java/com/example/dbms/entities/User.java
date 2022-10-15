package com.example.dbms.entities;

public class User {
	
	private int user_id;

	private String name;

	private String phone_no;
	
	private String email_id;
	
	private String password;

	private Double rating;
	
	// super constructor
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public User(String name, String password, String email_id, String phone, Double rating) {
		super();
		this.name = name;
		this.password = password;
		this.email_id = email_id;
		this.phone_no = phone;
		this.rating = rating;
	}
	
	//getter-setter
	
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	
	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	
	
}
