package com.cpg.discount;

import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Map<String, Float> map = new TreeMap<>();
		List<Float> dis = new ArrayList<>();
                
		Scanner sc = new Scanner(System.in);
		int noOfProducts = sc.nextInt();
		float min=0, discount=0;
		String str;
		String products[] = new String[noOfProducts];
                 
		for(int i=0; i<noOfProducts; i++) {
			products[i]= sc.next();
			str=products[i];
			String splitarray[] = new String[3];
			splitarray= str.split(",");
			discount=(Float.parseFloat(splitarray[1])*Float.parseFloat(splitarray[2]))/100;
                        
			dis.add(discount);      
			map.put(splitarray[0], discount);
         }
                
		Collections.sort(dis);
		min=dis.get(0);
		for(Entry<String, Float> entry : map.entrySet()) {
			if(min==entry.getValue())
				System.out.println(entry.getKey()+ " : " +entry.getValue());
        }
                
		sc.close();
	}       
}