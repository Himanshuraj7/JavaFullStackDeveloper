package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StreamDistinct {
	public static void main(String []args) {
		
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	Integer array[]=new Integer[size]; // collections need object, so we made wrapper class instead of primitive type
	List<Integer> list=new ArrayList<>();
	
	for(int i=0; i<size; ++i) {
		array[i]=sc.nextInt();
	}
	
	list=Arrays.asList(array);
	
	list.stream().distinct().forEach(System.out::println);
	
	sc.close();
	}
}