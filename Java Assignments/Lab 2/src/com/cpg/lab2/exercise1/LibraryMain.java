package com.cpg.lab2.exercise1;

import java.util.Scanner;

public class LibraryMain {
	Scanner sc=new Scanner(System.in);
	
	void askInput() {
		System.out.println("1. CheckIn  2. CheckOut");
	    int check=sc.nextInt();
		
		System.out.println("1. Book  2. Journal  3. Video  4. CD");
		System.out.println("Enter your choice: ");
		int input=sc.nextInt();
		
		switch(input) {
		case 1:
			Book book=new Book();
			if(check==1) {
				book.checkIn();
				book.print();
			}
			else {
				book.checkOut();
				book.print();
			}
			break;
//		case 2:
//			JournalPaper journal=new JournalPaper();
//			if(check==1)
//				journal.checkIn(journal);
//			else journal.checkOut(journal);
//		case 3:
//			Video video=new Video();
//			if(check==1)
//				video.checkIn();
//			else video.checkOut();
//			break;
//		case 4:
//			Cd cd=new Cd();
//			if(check==1)
//				cd.checkIn();
//			else cd.checkOut();
//			break;
		default:
			System.out.println("Wrong choice entered");
		}
	}
	public static void main(String[] args) {
		LibraryMain obj=new LibraryMain();
		obj.askInput();
	}
}