package com.dipu.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component 
@Order(1)
public class DBConRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("DB  Runner");
	}
}
