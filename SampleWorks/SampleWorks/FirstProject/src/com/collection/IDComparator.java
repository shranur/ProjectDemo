package com.collection;

import java.util.Comparator;

public class IDComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		if(emp1.getEmpid()>emp2.getEmpid()&& emp1.getSalary()>emp2.getSalary())
		return 1;
		
		else if (emp1.getEmpid()==emp2.getEmpid() && emp1.getSalary()== emp2.getSalary())
			return 0;
		else
			return -1;
	}
		
		// for comparing the name 
		
		public int compare1(Employee emp1, Employee emp2) {
		
		if(emp1.getName().compareTo(emp2.getName())>1)
			return 1;
		
		else if(emp1.getName().compareTo(emp2.getName())==0)
			return 0;
		else 
			return -1;
	}

}
