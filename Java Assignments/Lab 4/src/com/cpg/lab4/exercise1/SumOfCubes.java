package com.cpg.lab4.exercise1;

import java.util.Scanner;

public class SumOfCubes {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int sumFunction(int num)
	{
		int sum=0;
		int rem;
		while(num!=0)
		{
			rem=num%10;
			num=num/10;
			sum=sum+(rem*rem*rem);			
		}
		return sum;
	}
}
