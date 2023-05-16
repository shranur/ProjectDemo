package com.collection;

public class EmployeeExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeList el = new EmployeeList();
		el.addElement();
		el.displayEmployees();
		
		System.out.println("**********************************");
		
		el.sortEmployees();
		el.displayEmployees();
		
	}

}
