package com.app;

public class MyRepository {

	private String code;

	public MyRepository(String code) {
		super(); 
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "MyRepository [code=" + code + "]";
	}
	
	public MyRepository() {
		super();
	}

		
	
}
