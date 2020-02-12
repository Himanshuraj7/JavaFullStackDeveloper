package com.cpg.lab5.exercise2;

public class FibonacciSequence {
     
     
	int recursiveFibonacci(int number) {
		if (number==0)
		      return 0;
		   else if (number==1)
			   return 1;
		   else
			  return recursiveFibonacci(number-1) + recursiveFibonacci(number-2);
		
	
		
	}}
	
	