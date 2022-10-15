package com.example.dbms.entities;

import java.util.Date;

public class House {
	
	private int house_id;
	
	private Double area;
	
	private int construction_year;

	private String street;

	private String city;

	private String state;

	private String house_description;
	private int bhk;
	private int rent;

	private Date end_date;
	
	private int user_id;
	
	private Boolean isoccupied;

	public House() {
		super();
		// TODO Auto-generated constructor stub
	}

	public House(Double area, int construction_year, String street, String city, String state, String house_description,
			int bhk, int rent, Date end_date, int user_id, Boolean isoccupied) {
		super();
		this.area = area;
		this.construction_year = construction_year;
		this.street = street;
		this.city = city;
		this.state = state;
		this.house_description = house_description;
		this.bhk = bhk;
		this.rent = rent;
		this.end_date = end_date;
		this.user_id = user_id;
		this.isoccupied = isoccupied;
	}

	public int getHouse_id() {
		return house_id;
	}

	public void setHouse_id(int house_id) {
		this.house_id = house_id;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public int getConstruction_year() {
		return construction_year;
	}

	public void setConstruction_year(int construction_year) {
		this.construction_year = construction_year;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getHouse_description() {
		return house_description;
	}

	public void setHouse_description(String house_description) {
		this.house_description = house_description;
	}

	public int getBhk() {
		return bhk;
	}

	public void setBhk(int bhk) {
		this.bhk = bhk;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public Boolean getIsoccupied() {
		return isoccupied;
	}

	public void setIsoccupied(Boolean isoccupied) {
		this.isoccupied = isoccupied;
	}
	
}