package com.dipu.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.dipu.app.Token;

@Component("t1")
@Scope("singleton")
public class TokenService {
	
	@Autowired
	private Token token;

	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "TokenService [token=" + token + "]";
	}

	public TokenService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
