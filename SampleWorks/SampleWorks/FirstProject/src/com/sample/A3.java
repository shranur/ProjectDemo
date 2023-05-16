package com.sample;

import java.util.ArrayList;
import java.util.Iterator;

public class A3 {
	
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
	
	ArrayList<Integer> list1;
	ArrayList<Integer> list2;
	int count;
	
	public A3(){
		list1= new ArrayList<>();
		list2= new ArrayList<>();
	}
	
	public void addEle() {
	list1.add(3);
	list1.add(1);
	list1.add(11);
	list1.add(19);
	list1.add(17);
	list1.add(20);
	list1.add(21);
	list1.add(27);
	list1.add(33);
	list1.add(48);
	
	System.out.println(list1); // adding elements in list1 here
	}
	public void remove_3ele(){
		
		
		Iterator<Integer> ob =list1.iterator(); //creating iterating instance
		
		while(ob.hasNext()) {
			
			int i = ob.next();// storing number here after iteration
			count++;		  // increasing counter
			
			if (count%3==0) {
				ob.remove();
				list2.add(i);
			}

		}
		System.out.println(list2);

		
	}
}
