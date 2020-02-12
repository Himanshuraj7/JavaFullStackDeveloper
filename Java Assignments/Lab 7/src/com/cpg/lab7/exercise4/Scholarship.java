package com.cpg.lab7.exercise4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class Scholarship {
	Map<Integer, Integer> map1=new HashMap<>();
	HashMap<Integer, String> map2=new HashMap<>();
	
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int regNo, marks;
	String medal;
	
	void input() {
		for(int i=0; i<size; ++i) {
			regNo=sc.nextInt();
			marks=sc.nextInt();
			map1.put(regNo, marks);
		}
		System.out.println(map1);
	}
	
	Set<Map.Entry<Integer, Integer>> set = map1.entrySet();
	 
	HashMap<Integer, String> getStudents(){
		for(Map.Entry<Integer, Integer> me : set) {
			  regNo=me.getKey();
			  marks=me.getValue();
			  
			  if(marks>=90) medal="gold";
			  else if(marks>=80 && marks<90) medal="silver";
			  else if(marks>=90 && marks<80) medal="bronze";
			  else medal="none";
			  
			  map2.put(regNo, medal);
		   } 
		
		return map2;
	}
}
