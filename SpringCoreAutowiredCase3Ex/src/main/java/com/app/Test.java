package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(MyAppConfig.class);
		
		Object object = context.getBean("myService");
		System.out.println(object);
	}

}
