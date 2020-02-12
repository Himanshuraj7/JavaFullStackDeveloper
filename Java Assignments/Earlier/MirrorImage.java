package Earlier;

import java.util.Scanner;

public class MirrorImage {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	StringBuilder sb=new StringBuilder(s);
	
	
	String getImage() {
		return (s+"|"+sb.reverse());
	}
	
	public static void main(String[] args) {
		MirrorImage obj=new MirrorImage();
		System.out.print(obj.getImage());
	}
}