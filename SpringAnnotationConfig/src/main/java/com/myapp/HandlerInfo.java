package com.myapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hob")
public class HandlerInfo {

	// @Value used to initially Hard code 
	@Value("data")
	private String resolverCode;
	@Value("temp")
	private String pathToStore;
	
	public HandlerInfo() {
		super();
	}

	@Override
	public String toString() {
		return "HandlerInfo [resolverCode=" + resolverCode + ", pathToStore=" + pathToStore + "]";
	}
	
	
}
