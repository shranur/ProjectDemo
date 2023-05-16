package com.sample;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment2 {
	
	/*
	 * Given a method with two int array list of size 5 each as input. Write code to
	 * 
	 * merge the two array lists, Sort the merged array list in ascending order and
	 * fetch the elements at 2nd, 6th and 8th index into a new array lists and
	 * return the final ArrayList. Note- the first element is at index 0
	 * .Example:Input1: {3,1,11,19,17}
	 * Input2: {5,2,6,7,20} 
	 * Merged array list:{3,1,11,19,17,5,2,6,7,20}
	 *  Sorted array list: {1,2,3,5,6,7,11,17,19,20}
	 * Output: {3,11,19}
	 */




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(3);
		al1.add(1);
		al1.add(11);
		al1.add(19);
		al1.add(17);
		System.out.println("First list ::");
		System.out.println(al1);
		
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(5);
		al2.add(2);
		al2.add(6);
		al2.add(7);
		al2.add(20);
		System.out.println("Second list::");
		System.out.println(al2);
		
		//merging or adding both list
		ArrayList<Integer> al =  new ArrayList<Integer>();
		al.addAll(al1);
		al.addAll(al2);
		
		//sorting the final list
		Collections.sort(al);
		System.out.println(al);
		
		for(int i =2; i<al.size();i++) {
			if(i%2==0 && i!=4)
			{
				System.out.println(al.get(i));
			}
		}

	}

}
