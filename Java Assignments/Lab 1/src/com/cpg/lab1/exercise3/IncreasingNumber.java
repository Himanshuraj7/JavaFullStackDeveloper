package com.cpg.lab1.exercise3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IncreasingNumber {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int temp=num,a=0;
	ArrayList<Integer> al1=new ArrayList();
	ArrayList<Integer> al2=new ArrayList();
	boolean checknumber()
	{
		while(temp!=0)
		{
			a=temp%10;
			temp=temp/10;
			al1.add(a);
			al2.add(a);
			
		}
		Collections.reverse(al1);
		Collections.sort(al2);
		if(al1.equals(al2)) return true;
		else return false;	
	}

}
