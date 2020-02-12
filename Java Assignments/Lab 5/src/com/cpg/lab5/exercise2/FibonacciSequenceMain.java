package com.cpg.lab5.exercise2;

import java.util.Scanner;

public class FibonacciSequenceMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     int number = sc.nextInt();
		FibonacciSequence obj = new FibonacciSequence();
		
		System.out.println(obj.recursiveFibonacci(number));
		
		//obj.nonRecursiveFibonacci(number);
sc.close();
	}

}
