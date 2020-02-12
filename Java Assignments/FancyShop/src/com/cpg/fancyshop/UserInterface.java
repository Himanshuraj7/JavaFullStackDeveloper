package com.cpg.fancyshop;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	
	System.out.println("enter size : ");
	int size=sc.nextInt();
	int key;
	String value;
	Shop obj=new Shop();
	
	for(int i=0; i<size; ++i) {
		System.out.println("enter key : ");
		key=sc.nextInt();
		System.out.println("enter value : ");
		value=sc1.nextLine();
		obj.addProductDetails(key, value);
	}
	
	System.out.println("enter value to search : ");
	System.out.println(obj.searchBasedOnProduct(sc1.nextLine()));
	
	sc.close();
	sc1.close();
}
}