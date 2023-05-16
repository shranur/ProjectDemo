package Classes;

import org.testng.annotations.Test;

public class Car {
	
			
		//Global variables 
		
		int model;
		String Brand;
		int wheel;
		//@Test
		

		public static void main(String[] args) {
	      
			Car c = new Car();
			c.Brand= "BMW";
			c.model = 2020;
			c.wheel = 4;
			
			System.out.println(c.Brand  + "Model is" + c.model + ""  + "has wheels" + c.wheel);
			
		}

	}


