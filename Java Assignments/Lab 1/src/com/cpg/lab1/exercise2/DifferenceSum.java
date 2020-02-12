package com.cpg.lab1.exercise2;

import java.util.Scanner;

public class DifferenceSum {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	int diff=0;
	int CalculateDiff() {
	for(int i=1;i<=n;i++)
	{
		sum=sum+(i*i);	
	}
	int square=sum*sum;
	return Math.abs(sum-square);
	}	
}
