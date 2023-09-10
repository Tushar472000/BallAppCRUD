package com.Test.demo.controller.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ball {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String ballColor;
	String name;
	String mobileNo;
	public Ball() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ball(int id, String ballColor, String name, String mobileNo) {
		super();
		this.id = id;
		this.ballColor = ballColor;
		this.name = name;
		this.mobileNo = mobileNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBallColor() {
		return ballColor;
	}
	public void setBallColor(String ballColor) {
		this.ballColor = ballColor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Ball [id=" + id + ", ballColor=" + ballColor + ", name=" + name + ", mobileNo=" + mobileNo + "]";
	}
	
	
	
	
	
	
}
