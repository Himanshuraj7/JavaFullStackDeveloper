package Earlier;
import java.util.Scanner;

public class SumOfTheSquares {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0, square=0;
	
	int calculateDifference() {
		for(int i=1; i<=n; i++) {
			sum=sum+i*i;
		}
		square=sum*sum;
		
		return Math.abs(sum-square);
	}

	public static void main(String[] args) {
	
		SumOfTheSquares obj=new SumOfTheSquares();
		System.out.print(obj.calculateDifference());
	}
}
