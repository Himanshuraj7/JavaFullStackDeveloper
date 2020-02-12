package Earlier;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseIntegerArray {
	
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int array[]=new int[size];
	int temp, rev=0, rem=0;
	
	void display() {
		for(int i=0; i<size; ++i) {
			array[i]=sc.nextInt();
		}
		
		for(int i=0; i<size; ++i) {
			temp=array[i];
			rev=0;
			while(temp!=0) {
				rem=temp%10;
				temp=temp/10;
				rev=rev*10+rem;
			}
			array[i]=rev;
		}
		
		Arrays.sort(array);
		for(int i : array) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		ReverseIntegerArray obj=new ReverseIntegerArray();
		obj.display();
	}
}