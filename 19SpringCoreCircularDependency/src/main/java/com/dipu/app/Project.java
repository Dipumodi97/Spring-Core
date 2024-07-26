package com.dipu.app;

public class Project {

	private String pcode;

	private Employee eob;

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public Employee getEob() {
		return eob;
	}

	public void setEob(Employee eob) {
		this.eob = eob;
		System.out.println("Call Set() method of Proj");
	}

//	@Override
//	public String toString() {
//		return "Project [pcode=" + pcode + ", eob=" + eob + "]";
//	}

	public Project() {
		super();

		System.out.println("Project Object");
	}
	
	
}
