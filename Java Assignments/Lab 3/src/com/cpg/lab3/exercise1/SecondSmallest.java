package com.cpg.lab3.exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int array[]=new int[size];
	void getValues() {
	for(int i=0;i<size;i++)
	{
		array[i]=sc.nextInt();
	}
	}
	int findSmallest()
	{
		Arrays.sort(array);
		return array[1];
	}

}
