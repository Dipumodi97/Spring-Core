package com.dipu.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Format {

	@Autowired
	private IProcess pob;
	
	
	public void printFormat() {
		pob.getProcess();
		System.out.println("FROM FORMAT");
	}
}
