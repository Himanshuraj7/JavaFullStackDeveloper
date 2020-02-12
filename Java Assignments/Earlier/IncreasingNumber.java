package Earlier;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class IncreasingNumber {
	Scanner sc=new Scanner(System.in);
	int temp=sc.nextInt(), a=0;
	
	ArrayList<Integer> al1=new ArrayList();
	ArrayList<Integer> al2=new ArrayList();
	
	boolean checkNumber() {
		while(temp!=0) {
			a=temp%10;
			temp=temp/10;
			al1.add(a);
			al2.add(a);
		}
		
		 Collections.reverse(al1); // just reverse the al1
		 Collections.sort(al2); // sorts al2 a/c to number
		 
		if(al1.equals(al2)) return true;
		else return false;
	}
	public static void main(String[] args) {
		
		IncreasingNumber obj=new IncreasingNumber();
		System.out.print(obj.checkNumber());
	}
}
