package com.app.repo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyRepo {
	
	@Value("SAMPLE")
	private String entity;

	@Override
	public String toString() {
		return "MyRepo [entity=" + entity + "]";
	}
	
	

}
