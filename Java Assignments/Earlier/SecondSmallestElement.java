package Earlier;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestElement {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int arr[]=new int[size];
	
	int getSecondSmallest() {
		for(int i=0; i<size; ++i) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		return arr[1];
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the size of array: ");
		SecondSmallestElement obj=new SecondSmallestElement();
		System.out.print(obj.getSecondSmallest());
	}
}