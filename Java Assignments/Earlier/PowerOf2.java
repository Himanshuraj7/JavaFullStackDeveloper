package Earlier;
import java.util.Scanner;

public class PowerOf2 {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	
	boolean checkNumber() {
		if(num&(num-1)!=0) return false; // if a number n is a power of 2 then bitwise & of n and n-1 will be zero
		else return true; // 4(100) & 3(011)= 000
	}
	
	public static void main(String[] args) {
		PowerOf2 obj=new PowerOf2();
		System.out.print(obj.checkNumber());
	}
}