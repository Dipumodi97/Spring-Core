package com.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.app")
public class MyAppConfig {
	
	// 1 method = 1 object
	
	@Bean
	@Primary
	public MyRepository m1() {
		MyRepository mr = new MyRepository();
		mr.setCode("A");
		
		return mr;
	}
	@Bean
	public MyRepository m2() {
		
		// To use repo() method in MyService class as @Autowired of MyRepository
	    //public MyRepository repo() {
		
		// select (alt+shift+r) to change all code if select anyone
		MyRepository mr1 = new MyRepository();
		mr1.setCode("B");
		
		return mr1;
	}

}
