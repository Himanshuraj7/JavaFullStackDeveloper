package com.cpg.lab5.exercise6;
import com.cpg.lab5.exceptions.EmployeeException;
import java.util.Scanner;

/*class EmployeeException extends Exception {
	
	public EmployeeException(String s) {
		super(s);
	}

}*/

public class ValidateSalary {

		Scanner sc = new Scanner(System.in);
		int salary;
		
		void getSalary() {
			salary= sc.nextInt();
		}
		
		void validate() {
			
			try {
				if(salary<3000)
					throw new EmployeeException("Not Valid");
				else
					System.out.println("Valid");
				
				}
			catch(EmployeeException e) {
				
				System.out.println(e.getMessage());
				
				}
			
		}
	}


