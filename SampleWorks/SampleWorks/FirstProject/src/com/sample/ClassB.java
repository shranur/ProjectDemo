package com.sample;

import com.collection.ClassA;

public class ClassB extends ClassA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassB cls = new ClassB();
		cls.method2();
	}
	
public static void method2() {
	System.out.println("in child");

	}
@Override
public void method1() {
	System.out.println("in child");
}

	
}
