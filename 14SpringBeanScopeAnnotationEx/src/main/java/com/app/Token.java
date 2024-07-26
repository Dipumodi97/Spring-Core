package com.app;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("t1")
@Scope("singleton")
//@Scope("prototype")
public class Token {
	
	private Integer code;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Token() {
		super();
		
		// if we don't want -ve number we use Math.abs()
		// if we are using only Random() then find +ve and -ve number
		
		code =Math.abs(new Random().nextInt());
	}

	@Override
	public String toString() {
		return "Token [code=" + code + "]";
	}
	
	

}
