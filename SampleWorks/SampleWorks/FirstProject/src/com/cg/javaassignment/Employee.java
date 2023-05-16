package com.cg.javaassignment;

import java.util.Set;

public class Employee {
	
	private int empid;
	private String name;
	private float basicsal;
	Set skillset;
	String[] skills;
	
	public Employee(int empid, String name, float basicsal, Set skillset , String [] skills) {
		
		this.empid = empid;
		this.name = name;
		this.basicsal = basicsal;
		this.skillset = skillset;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBasicsal() {
		return basicsal;
	}

	public void setBasicsal(float basicsal) {
		this.basicsal = basicsal;
	}

	public Set getSkillset() {
		return skillset;
	}

	public void setSkillset(Set skillset) {
		this.skillset = skillset;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	
	

}
