package com.dipu.app;

public class Employee {

	private String name;
	
	private Project pob;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Project getPob() {
		return pob;
	}

	public void setPob(Project pob) {
		this.pob = pob;
		System.out.println("Call Set() method of Emp");
	}

	// toString() is called in the loop
	
	// if we remove toString() method then output will become show otherwise 
	// it's find java.lang.StackOverflowError
	@Override
	public String toString() {
		return "Employee [name=" + name + ", pob=" + pob + "]";
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Employee Object");
	}
}
