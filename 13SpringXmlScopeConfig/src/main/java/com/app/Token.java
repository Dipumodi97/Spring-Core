package com.app;

import java.util.Random;

public class Token {
	
	private String code;

	
	@Override
	public String toString() {
		return "Token [code=" + code + "]";
	}

	public Token() {
		super();
		// code=String.valueOf(Math.abs(new Random().nextInt()));
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
	

}
