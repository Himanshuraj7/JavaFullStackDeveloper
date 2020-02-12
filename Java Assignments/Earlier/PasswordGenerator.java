package Earlier;

import java.util.Scanner;

public class PasswordGenerator {
	Scanner sc=new Scanner(System.in);
	String name1, name2;
	int num1, num2;
	
	void input() {
		System.out.println("enter name one ");
		name1=sc.nextLine();
		System.out.println("enter name two ");
		name2=sc.nextLine();
		System.out.println("enter no one ");
		num1=sc.nextInt();
		System.out.println("enter no two ");
		num2=sc.nextInt();
		
	}
	
	StringBuilder passwordGenerator() {
		StringBuilder sb=new StringBuilder();
		String lala=Integer.toString(num1);
		StringBuilder sb2=new StringBuilder(lala);
		
		int size1=name1.length();
		int size2=name2.length();
		
		if(size1<size2) 
			sb.append(name1.charAt(0));
		
		else if(size1==size2) {
			char temp1=name1.charAt(0);
			char temp2=name2.charAt(0);
			
			if(temp1<temp2) 
				sb.append(temp1);
			
			else sb.append(temp2);
		}
		
		else sb.append(name2.charAt(0));
		
		if(size1>size2) 
			sb.append(name1);
		
		else sb.append(name2);
		
		for(int i=0; i<sb.length(); ++i) {
			char ch=sb.charAt(i);
			if(Character.isLowerCase(ch))
				sb.setCharAt(i, Character.toUpperCase(ch));
			else sb.setCharAt(i, Character.toLowerCase(ch));
		}
		
		sb.append(sb2.charAt(num2-1));
		sb2.reverse();
		sb.append(sb2.charAt(num2-1));
		
		return sb;
	}
	
	public static void main(String[] args) {
		PasswordGenerator obj=new PasswordGenerator();
		obj.input();
		System.out.print(obj.passwordGenerator());
}
}