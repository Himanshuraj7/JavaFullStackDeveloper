package com.cpg.lab2.exercise1;

public abstract class Item {
	
	private int uniqueIdNumber=123;
	private int numOfCopies=10;
	private String title="c++";
	
	public int getUniqueIdNumber() {
		return uniqueIdNumber;
	}
	public void setUniqueIdNumber(int uniqueIdNumber) {
		this.uniqueIdNumber = uniqueIdNumber;
	}
	public int getNumOfCopies() {
		return numOfCopies;
	}
	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	abstract void checkIn();
	abstract void checkOut();
	abstract void print();
	
}
