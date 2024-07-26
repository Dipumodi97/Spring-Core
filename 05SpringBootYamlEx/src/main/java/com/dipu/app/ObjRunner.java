package com.dipu.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ObjRunner implements CommandLineRunner{

	@Autowired
	private EmailConfig ec;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(ec);
		
	}

}
