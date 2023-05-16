package com.sample;

import java.util.HashMap;

public class CharOccurence {
	
	public static void charOccurence(String str) {
		
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		char charArray[] = str.toCharArray();
		
		for (char ch : charArray) {
			
			//for remove spaces in result use this line
			if(!String.valueOf(ch).isBlank())
				
				
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}
			else{
				hm.put(ch, 1);
			}
		}
		
		System.out.println(str + " " + hm);
		
	}

	public static void main(String[] args) {
		
		charOccurence("");
	}

}
