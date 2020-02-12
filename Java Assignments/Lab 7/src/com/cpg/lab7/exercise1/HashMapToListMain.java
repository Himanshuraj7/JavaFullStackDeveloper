package com.cpg.lab7.exercise1;

public class HashMapToListMain {
	public static void main(String []args) {
		
		HashMapToList obj=new HashMapToList();
		obj.input();
		System.out.println(obj.listOfKeys());
		System.out.println(obj.listOfValues());
		System.out.println(obj.sortedValues());
	}
}
