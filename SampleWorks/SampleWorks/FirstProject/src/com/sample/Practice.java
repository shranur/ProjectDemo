package com.sample;

import java.util.LinkedHashSet;

public class Practice {
	
	LinkedHashSet<Character> list;
	LinkedHashSet<Character> list1;
	
	Practice(){
		list= new LinkedHashSet<>();
		list1= new LinkedHashSet<>();
	}
	
	public int findUnique(String str) // Helloworld
	{
		
		for(int i=0;i<str.length();i++)
		{
		  if(!list.add(str.charAt(i)))
		  
			  list1.add(str.charAt(i));
		  
		}
		
		list.removeAll(list1);
		if(list.size()==0)
		  return -1;
		//System.out.println("negative");
		
		else
			return list.size();
		
		
		
	}
	
	public static void main(String[] args) {
		
		Practice pt = new Practice();
		pt.findUnique("coco");
	}

}


