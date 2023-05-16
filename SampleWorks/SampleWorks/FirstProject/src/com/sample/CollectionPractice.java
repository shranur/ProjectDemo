package com.sample;

import java.util.ArrayList;

public class CollectionPractice {
	
	static ArrayList<String> list;
	
	public static void setData(String data , String data1) 
	{
		 list = new ArrayList<String>();
		list.add(data1);
		list.add(data);
		System.out.println(list);
		String[] str = data.split(" ", 0);
		System.out.println(str);
		for(int j=0;j<str.length-1;j++) {
			
			char cValue = str.toString().charAt(j);
			
		
		}
	}
	
	public static void manipulateData(ArrayList list) {
		
		System.out.println(list);
		
		int size = list.size();
		
		for(int i=0; i<size;i++) {
			
			System.out.println( list.get(i));
			
			
		}
		//System.out.println(list);
		
		if(list.isEmpty()) {
			
			System.out.println("Enter some data!!");
			
		}
		else {
			System.out.println("no");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setData("This is My DATA!","This is My DATA1");
		//manipulateData(list);
	}

}
