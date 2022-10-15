package com.example.dbms.entities;

import java.sql.Blob;

public class Image {
	private int image_id;
	private int house_id;
	private Blob blob;
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Image(int image_id, int house_id, Blob blob) {
		super();
		this.image_id = image_id;
		this.house_id = house_id;
		this.blob = blob;
	}
	public int getImage_id() {
		return image_id;
	}
	public void setImage_id(int image_id) {
		this.image_id = image_id;
	}
	public int getHouse_id() {
		return house_id;
	}
	public void setHouse_id(int house_id) {
		this.house_id = house_id;
	}
	public Blob getBlob() {
		return blob;
	}
	public void setBlob(Blob blob) {
		this.blob = blob;
	}
}
