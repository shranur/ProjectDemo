package com.sample;

import java.util.HashMap;

public class Assignment6 {

//	Given a method with a HasMap<int,float> as input. Write code to find out average of all values whose keys are even numbers. Round the average to two decimal places and return as output.
//    Example:
//
//			Input: {1:2.3,2:4.1,6:6.2}
//
//			Output: (4.1+6.2)/2=10.3/2=5.15
	
	
	HashMap<Integer, Double> hm;

	Assignment6(){
	
	hm = new HashMap<Integer, Double>();
	
}

	public void method() {
		hm.put(1,2.3);
		hm.put(2,4.1);
		hm.put(6, 6.2);
		
		System.out.println(hm);
		
	}
	
	public double average() {
		double sum = 0;
		for(int i=0; i<hm.size();i++) {
			if(hm.get(i)%2==0) {
			sum=sum+hm.get(i);
			}
			
		
		
		
	}
		return sum;
		}
	}
	
	
	

