package com.cpg.lab5.exercise1;

import java.util.Scanner;

public class TrafficLightSimulation {
    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();
	 void getChoice() {
		 switch(choice) {
		 case 1:
			 System.out.println("STOP!");
			 break;
		 case 2:
			 System.out.println("GO");
			 break;
		 case 3:
			 System.out.println("READY");
			 break;
		 }
		
	}
	
}
