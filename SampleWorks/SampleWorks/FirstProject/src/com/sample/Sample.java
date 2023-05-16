package com.sample;

class Parent {
	
	void first() {
		System.out.println("You're in first block");
	}
}

class Child extends Parent{
	void first() {
		System.out.println("You're in child block");
	}
}

public class Sample {

	public static void main(String[] args) {
		
		Parent ob =  new Child();
		//Parent c = (Parent)ob;
		ob.first();
		
		// TODO Auto-generated method stub
		//System.out.println("Capgemini!!");

	}

}
