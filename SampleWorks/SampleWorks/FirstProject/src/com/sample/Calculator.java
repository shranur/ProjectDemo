package com.sample;

import java.util.ArrayList;

public class Calculator {
	
//	String []s1 = 
//	String []s2;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList<String> str = new ArrayList<String>();
		Calculator cal = new Calculator();
		cal.method();
	}
	public void method() {
		 String s = "lays";
		 char newChar=' ';
	
		for(int i=0; i<s.length(); i++) {
		char c = s.charAt(i);
		if(c>s.charAt(i++)) {
			 newChar = c;
		}
	}
		System.out.println(newChar);
	}

}
