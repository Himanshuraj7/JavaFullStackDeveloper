package com.cpg.lab3.exercise4;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) 
	{ 
		NoOfOccurenceOfCharacters obj=new NoOfOccurenceOfCharacters();
		Scanner sc = new Scanner(System.in); 
		String str = sc.nextLine(); 
		obj.getOccuringChar(str); 
	} 
}
