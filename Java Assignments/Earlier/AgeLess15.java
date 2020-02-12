package Earlier;

import java.util.Scanner;

 class MyException extends Exception{ // user defined exception named MyException
	MyException(String s){
	super(s);
	}
}

public class AgeLess15 {
	public static void main(String[] args) throws MyException{
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		try {
		if(age<15) {
			throw new MyException("Age is less than 15");
		}
		else System.out.print("Age accepetd");
		}
		
		catch(MyException e) {
			System.out.print(e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}