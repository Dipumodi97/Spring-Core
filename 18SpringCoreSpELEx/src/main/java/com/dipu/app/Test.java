package com.dipu.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppCofig.class);
		Process process = context.getBean("process", Process.class);
		System.out.println(process);
	}
}
