package Earlier;

import java.util.Scanner;

public class RemoveDuplicate {
	Scanner sc=new Scanner(System.in);
	char[] array = sc.next().toCharArray();
	char temp[]=new char[array.length];
	
	void display() {
		for(int i =0; i<array.length; ++i){
            int j;
            for(j=0; j<i; ++j){
                if(array[i]==array[j])
                	break;
            }
            if(i == j)
            	System.out.println(array[i]);
        }
	}
	public static void main(String[] args) {
		RemoveDuplicate obj=new RemoveDuplicate();
		obj.display();
	}
}