package com.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.myAppConfig;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(myAppConfig.class);
		
		Object bean = context.getBean("con");
		System.out.println(bean);
		
	}
}
