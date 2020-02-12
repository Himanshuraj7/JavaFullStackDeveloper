package com.cpg.lab5.exercise5;
import com.cpg.lab5.exceptions.UserDefinedException;
import java.util.Scanner;

/*class UserDefinedException extends Exception{
	
	UserDefinedException(String s){
		super(s);
	}
}*/

public class ValidateAge {
	Scanner sc = new Scanner(System.in);
	int age;
	
	void getAge() {
		age= sc.nextInt();
	}
	
	void validate() {
		
		try {
			if(age<15)
				throw new UserDefinedException("Age is not Valid");
			else
				System.out.println("Age is valid");
			
			}
		catch(UserDefinedException e) {
			
			System.out.println(e.getMessage());
			
			}
		
	}
}
