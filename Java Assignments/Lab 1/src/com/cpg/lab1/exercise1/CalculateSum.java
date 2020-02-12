package com.cpg.lab1.exercise1;

import java.util.Scanner;

public class CalculateSum {
	int sum=0;
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sumfunc()
	{
	for(int i=1;i<=n;i++)
	{
		if(n%3==0 || n%5==0)
		{
			sum=sum+i;
		}
	}
	return sum;
	}

}
