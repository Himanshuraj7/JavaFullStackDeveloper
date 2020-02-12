package com.cpg.lab5.exercise4;

import com.cpg.lab5.exceptions.MyException;
import java.util.Scanner;

/*class MyException extends Exception{
	public MyException(String s) {
		super(s);
	}
}*/


public class ValidateFullName {
	
	String firstName,lastName;
	
	Scanner sc = new Scanner(System.in);
	
	void getData() {
		
	
	firstName = sc.nextLine();
	lastName = sc.nextLine();}
	
	void validateFirstName() {
		try {
			if(firstName.isEmpty())
			throw new MyException("First Name is not inserted");
			else
				System.out.println("First Name is Inserted");
			
		}
		catch(MyException e) {
			System.out.println("Caught 1");
			System.out.println(e.getMessage());
			
		}
		
	}
	void validateLastName() {
		
		try {
			if(lastName.isEmpty())
			throw new MyException("Last Name is not inserted");
			else
				System.out.println("Last Name is Inserted");
		}
		catch(MyException e) {
			System.out.println("Caught 2");
			System.out.println(e.getMessage());
			
		}
	}
}
