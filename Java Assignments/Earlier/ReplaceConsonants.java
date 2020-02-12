package Earlier;

import java.util.Scanner;

public class ReplaceConsonants {
	
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	StringBuilder sb1=new StringBuilder(s);
	StringBuilder sb2=new StringBuilder();
	char temp;
	int size=s.length();
			
	
	StringBuilder alterString() {
		for(int i=0; i<size; ++i) {
			temp=sb1.charAt(i);
			if(temp=='A' || temp=='E' || temp=='I' || temp=='O' || temp=='U') {
				sb2.append(temp);
			}
			else {
				temp+=1;
				sb2.append(temp);
			}
		}
		return sb2;
	}
	public static void main(String[] args) {
		ReplaceConsonants obj=new ReplaceConsonants();
		System.out.print(obj.alterString());
	}
}