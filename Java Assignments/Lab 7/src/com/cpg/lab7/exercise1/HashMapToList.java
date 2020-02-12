package com.cpg.lab7.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class HashMapToList {
	HashMap<Integer, String> hashmap=new HashMap<>();
	TreeMap<Integer, String> treemap=new TreeMap<>();
	ArrayList<Integer> listOfKeys=null;
	ArrayList<String> listOfValues=null;
	
	int regNo;
	String name;
	Scanner sc1=new Scanner(System.in);
	Scanner sc2=new Scanner(System.in);
	int size=sc1.nextInt();
	
	void input() {
		for(int i=0; i<size; ++i) {
			regNo=sc1.nextInt();
			name=sc2.nextLine();
			hashmap.put(regNo, name);
		}
		treemap.putAll(hashmap);
	}
	
	ArrayList<Integer> listOfKeys() {
        listOfKeys = treemap.keySet().stream().collect(Collectors.toCollection(ArrayList::new)); 
		listOfValues = treemap.values().stream().collect(Collectors.toCollection(ArrayList::new));
        
        return listOfKeys;
	}
	
	ArrayList<String> listOfValues() {
		return listOfValues;
	}
	
	ArrayList<String> sortedValues() {
		Collections.sort(listOfValues);
		return listOfValues;
	}
}