package com.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Given a method with an ArrayList which contains student information like name
		 * and obtained marks of three subject in string format separated with
		 * delimiter'-'.
		 * Example: "suresh-70-47-12".
		 * 
		 * Write a code to find out a student who scored the highest marks.
		 * Example: 
		 * An ArrayList is given as["sunil-56-88-23","bindul-88-70-10",john-70-49-65"] 
		 * sunil= 56+88+23=167
		 * bindul= 88+70+10=168
		 * john= 70+49+65=184
		 * Hence, the final result will be john who scored highest marks
		 */
		
		/*
		 * String s1 = "sunil-56-88-23";
		 * 
		 * //using split method String str[] =s1.split("-"); for (String string : str) {
		 * System.out.println(string); }
		 */
		     
		String s2 = "bindul-88-70-10";
		String amt = "";
		Integer sum=0;
		Integer amount =0;
		//split string with pattern class
		List<String> l=Pattern.compile("-").splitAsStream(s2).collect(Collectors.toList());
		for (String strng : l) {
			System.out.println(strng);
			for(int i=1; i<=strng.length();i++) {
				amt = l.get(i);
				sum= Integer.valueOf(amt);
				amount = amount+sum;
			}
			System.out.println(amount);
			//Double db =Double.valueOf(strng);
		}
		
		// using Stringtokenizer
		String s3 = "john-70-49-65";
		StringTokenizer st = new StringTokenizer(s3, "-");
		while(st.hasMoreTokens()) {
			String newStr = st.nextToken();
			System.out.println(newStr);
			//Double db1 = Double.valueOf(newStr);
		}
		
		
		
		ArrayList<String> al = new ArrayList<String>();
		/*
		 * al.add(s1); al.add(s2); al.add(s3);
		 */
		//System.out.println(al);
		
		

	}

}
