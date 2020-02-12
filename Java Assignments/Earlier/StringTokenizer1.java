package Earlier;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizer1 {
	Scanner sc=new Scanner(System.in);
	String input=sc.nextLine(), temp;
	int sum=0;
	
	StringTokenizer st=new StringTokenizer(input, " ");
	
	void display() {
	while(st.hasMoreTokens()) {
		temp=st.nextToken();
		sum=sum+Integer.parseInt(temp);
		System.out.println(temp);
	}
	System.out.print("Sum = "+sum);
	sc.close();
	}
	
	public static void main(String[] args) {
		StringTokenizer1 obj=new StringTokenizer1();
		obj.display();
	}
}