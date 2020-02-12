package Earlier;
import java.util.Scanner;

public class SumOfNaturalNum {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;

	public int calculateSum() {	
		for(int i=1; i<=n; i++) {
			if(i%3==0 || i%5==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfNaturalNum obj=new SumOfNaturalNum();
		System.out.println(obj.calculateSum());
	}
}
