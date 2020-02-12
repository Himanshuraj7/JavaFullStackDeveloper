package com.cpg.lab2.exercise1;

public class Book extends WrittenItem {
	
	void checkIn() {
		int temp=getNumOfCopies()+1;
	    setNumOfCopies(temp);
	}
	void checkOut() {
		if(getNumOfCopies()>0) {
			int temp=getNumOfCopies()-1;
			setNumOfCopies(temp);
		}
		else System.out.println("0 copies available");
	}
	void print() {
		System.out.println(getNumOfCopies());
		System.out.println(getAuthor());
		System.out.println(getTitle());
		System.out.println(getUniqueIdNumber());
	}
	}