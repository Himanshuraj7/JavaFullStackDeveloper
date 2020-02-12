package com.cs.jdbcConDemo.dto;

public class UserProfile {
	private String userId, fname, lName;
	private int age;
	
	public UserProfile() {
		super();
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getiName() {
		return lName;
	}
	public void setiName(String iName) {
		this.lName = iName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
