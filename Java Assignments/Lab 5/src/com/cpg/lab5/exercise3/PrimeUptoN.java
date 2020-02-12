package com.cpg.lab5.exercise3;

import java.util.Scanner;

public class PrimeUptoN {
	
	Scanner sc = new Scanner(System.in);
	int number;
	
	void getNumber()
	{
	System.out.println("Enter limit");
	number = sc.nextInt();
	}
	
	void printNumbers() {
		
		for(int j=2;j<=number;++j) {
			boolean flag = false;
        for(int i = 2; i <= j/2; ++i)
        {
        	
            // condition for nonprime number
            if(j % i == 0)
            {
                flag = true;
                break;
            }
            
        }if (!flag)
            System.out.println(j);
        
       
	}}
	

}
