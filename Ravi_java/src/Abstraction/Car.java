package Abstraction;

import Collection.ArrayList;

public class Car extends Vehicle {    //regular class extending Vehicle class
	int no_of_tyres=4;
	void start() {                 // If a regular class extends an abstract class, 
		                               //then the class must have to implement all the abstract methods of abstract parent class or it has to be declared abstract as well.
		System.out.println("Start with key");
		
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.start();
		Scooty s=new Scooty();
		s.start();
		Car ca = new Car();
		ca.method();
	}
	public void method() {
		java.util.ArrayList<String> list = new java.util.ArrayList<String>();
		list.add("ravi");
		
	}
}


