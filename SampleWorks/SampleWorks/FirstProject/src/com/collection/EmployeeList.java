package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {
	
	ArrayList<Employee>array;

	public EmployeeList() {
	array=new ArrayList<>();
	}

	public void addElement()
	{
	array.add(new Employee(101,"Tom",120345));
	array.add(new Employee(100,"Jerry",102345));
	array.add(new Employee(105,"Noddy",123450));
	array.add(new Employee(102,"Bob",123405));
	array.add(new Employee(104,"Alpha",1234500));
	array.add(new Employee(103,"Mojo",1002345));
	}

	public void sortEmployees()
	{
	Collections.sort(array,new IDComparator());
	}

	public void displayEmployees()
	{
	array.forEach(emp->System.out.println(emp));
	}



	}




