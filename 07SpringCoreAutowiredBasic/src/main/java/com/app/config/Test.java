package com.app.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(MyAppConfig.class);
		
		Object object = context.getBean("myService");
		System.out.println(object);
	}
}
