package com.sample;

import java.util.ArrayList;

public class OddNumber {
	
	public static  void findOddNum(int a, int b) {
		ArrayList<Integer> arrList = new ArrayList<>();
		for(int i =a;i<=b;i++) {
			

			if(i%2==0) {
				
						
			}
			else {
			arrList.add(i);
			
			
			
			}
					
		}
		System.out.println("odd numbers" +" " +arrList);
		System.out.println("Total Odd numbers:" + " " +arrList.size());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findOddNum(-1,-10);

	}
}
