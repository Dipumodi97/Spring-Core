package com.dipu.app.refType;

/*
 * No need to use @Component in Process class
 * because, @Component  will create the object
 * and It'll allocate default value is 0 and null.
 * if data is not there.
 * 
 * If we write @ConfigurationProperties(),
 * it won't create the object it'll create the reference.
 * If data is present, then it'll create the object and id is prefer some value.
 */
public class Process {
	
	private int pid;
	
	private String pcode;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	@Override
	public String toString() {
		return "Process [pid=" + pid + ", pcode=" + pcode + "]";
	}
	
	public Process() {
		// TODO Auto-generated constructor stub
	}

}
