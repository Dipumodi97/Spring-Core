package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyAppConfig.class);
//		context.scan("com.app");
//		context.refresh();
		
		Object bean1 = context.getBean("eobj");
		Object bean2 = context.getBean("cob");
		System.out.println(bean1);
		System.out.println(bean2);
	}
}
