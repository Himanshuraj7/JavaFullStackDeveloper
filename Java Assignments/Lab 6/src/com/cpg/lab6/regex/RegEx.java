package com.cpg.lab6.regex;

import java.util.regex.*;

public class RegEx {
	String str="hello, hey, heishal, heimanhu, heishah, heshain";
	Pattern pattern=Pattern.compile("he");
	Matcher matcher=pattern.matcher(str);
	
	void fun() {
		System.out.println(matcher.matches());
		
		while(matcher.find()) {
			System.out.println(matcher.group()+" : "+matcher.start()+" : "+matcher.end());
		}
	}
	
	public static void main(String [] args) {
		RegEx obj=new RegEx();
		obj.fun();	
	}
}