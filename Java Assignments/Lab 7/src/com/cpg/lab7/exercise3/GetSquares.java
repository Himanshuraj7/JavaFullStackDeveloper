package com.cpg.lab7.exercise3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class GetSquares  {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int[] array=new int[size];
	int temp;
	
	void input() {
		for(int i=0; i<size; ++i) {
			temp=sc.nextInt();
			array[i]=temp;
		}
	}
	
	LinkedHashMap<Integer, Integer> map=new LinkedHashMap<>();
	
	Map<Integer, Integer> getSquares() {
		for(int i=0; i<array.length; ++i) {
			map.put(array[i], (array[i]*array[i]));
		}
		return map;
	}
}