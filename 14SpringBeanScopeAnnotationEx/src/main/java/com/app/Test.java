package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Token token = ac.getBean("t1",Token.class);
		System.out.println(token);
		Token token1 = ac.getBean("t1",Token.class);
		System.out.println(token1);
	}

}
