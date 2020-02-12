package com.cpg.lab3.exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int[] arr=new int[size];
	
	void getData()
	{
		for(int i=0;i<size;i++)
		{	
			arr[i]=sc.nextInt();
		}
	}
	void displayData()
	{
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
	int reverseSort()
	{
		for(int i=0;i<size;i++)
		{
			int rem=0, rev=0;
			int temp=arr[i];
			while(temp!=0)
			{
				rem=temp%10;
				temp=temp/10;
				rev=rev*10+rem;				
			}
			arr[i]=rev;
		}
		Arrays.sort(arr);
		for(int i:arr)
		{
			System.out.println(i);
		}
		return 0;
	}

}

