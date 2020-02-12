package com.cpg.lab1.exercise4;

import java.util.Scanner;

public class PowerOfTwo {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	boolean check()
	{
		if(num==0)
			return false;
		while(num!=1)
		{
			if(num%2!=0)
			{
				return false;
			}
			num=num/2;
		}
		return true;
	}

}
