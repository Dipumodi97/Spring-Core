package com.dipu.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(-4)
public class EmailConfigRunner implements CommandLineRunner{
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Email Config Runner....");
		
	}

}
