package com.dipu.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("DEFAULT MESSAGE RUNNER");
		
	}
}
	