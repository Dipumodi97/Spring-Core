package com.app;

import java.util.Random;

public class Token {
	
	private Integer code;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Token [code=" + code + "]";
	}

	public Token() {
		
		super();
		System.out.println("Constructor Called....");
       code = Math.abs(new Random().nextInt());
	}
	
	

}
