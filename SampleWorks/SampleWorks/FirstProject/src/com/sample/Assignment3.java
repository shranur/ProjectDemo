package com.sample;

import java.util.ArrayList;
import java.util.Iterator;



public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Given a method with an int array list as an input. Write code to remove every
		 * 3rd element and return the final array list. Suppose the given array list
		 * contains 10 elements remove the 3rd, 6th and 9th element.
		 * 
		 * 
		 * Example:
		 * 
		 * Input :{ 3, 1, 11, 19, 17, 19}
		 * 
		 * Output :{ 3, 1, 19, 17}
		 */
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(1);
		list.add(11);
		list.add(19);
		list.add(17);
		list.add(20);
		list.add(21);
		list.add(27);
		list.add(33);
		list.add(48);
		
		System.out.println("list of integers::");
		System.out.println(list);
		
		Iterator it= list.iterator();
		while(it.hasNext())
		{
		      Integer obj = (Integer)it.next();
		     // it.next();
			//System.out.println(obj);
			if(obj%3==0)
			{
				System.out.println(obj);
			}
			
		}
		
		
		
//		for(int i=3; i<list.size();i++) {
//			if(i%3==0)
//			{
//				System.out.println(list.get(i));
//			}
		}
	}


