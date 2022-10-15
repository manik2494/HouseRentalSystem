package com.example.dbms.entities;

public class ReviewHouse {
	
	private int user_id;
	
	private int house_id;
	
	private String description;
	private int rating;
	
	public ReviewHouse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReviewHouse(int user_id, int house_id, String description, int rating) {
		super();
		this.user_id = user_id;
		this.house_id = house_id;
		this.description = description;
		this.rating = rating;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
