package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Create by Spring Container");
		ApplicationContext ac = 
				new AnnotationConfigApplicationContext(AppConfig.class);
	
		System.out.println("to read the object of Token");
		Token token = ac.getBean("t1",Token.class);
		System.out.println(token);
		Token token1 = ac.getBean("t1",Token.class);
		System.out.println(token1);
	}
}
