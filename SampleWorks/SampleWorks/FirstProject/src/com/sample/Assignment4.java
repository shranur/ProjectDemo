package com.sample;

import java.util.HashSet;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Given a method with a string input. Write code to remove duplicate characters
		 * from string. Note-Only the first occurrence should be retained.
		 * Example:Input: ' hi this is sample test' 
		 * Output = 'hi tsample'
		 */
		String s = "hi this is sample test";
		HashSet<String> hs = new HashSet<>();
		hs.add(s);
		System.out.println(hs);
		
	}

}
