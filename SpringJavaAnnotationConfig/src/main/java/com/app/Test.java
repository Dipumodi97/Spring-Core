package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = 
				new AnnotationConfigApplicationContext(myAppConfig.class);
		Object object = ac.getBean("objConfig");
		System.out.println(object);
	}

}
