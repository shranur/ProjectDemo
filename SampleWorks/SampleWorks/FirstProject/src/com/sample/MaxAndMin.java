package com.sample;

public class MaxAndMin {
	
	
	public static  int maxNum (int a,int b, int c) {
		
		//int count = 0;
		int max = 0;
		while (a> 0 || b >0 || c>0)
		{
			a--;
			b--;
			c--;
			max++;
			
		}
 		System.out.println(max);
		return max;
		
	}
	
public static  int minNum (int a,int b, int c) {
		
		//int count = 0;
		int min = 0;
		while (a> 0 && b >0 && c>0)
		{
			a--;
			b--;
			c--;
			min++;
			
		}
 		System.out.println(min);
		return min;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		minNum(3, 2, 1);

	}

}