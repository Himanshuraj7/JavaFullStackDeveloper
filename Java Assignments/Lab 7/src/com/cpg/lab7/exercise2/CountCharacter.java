package com.cpg.lab7.exercise2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacter {
	Scanner sc=new Scanner(System.in);
	char[] array = sc.next().toCharArray();
	int count=0;
	
	LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
	
	Map<Character, Integer> countCharacter() {
		for(int i=0; i<array.length; ++i) {
			count=0;
			for(int j=0; j<array.length; ++j) {
				if(array[i]==array[j]) count++;
			}
			map.put(array[i], count);
		}
		
		return map;
	}
}