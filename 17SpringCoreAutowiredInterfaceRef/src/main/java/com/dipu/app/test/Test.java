package com.dipu.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dipu.app.Format;
import com.dipu.app.config.AppConfig;

public class Test {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Format format = context.getBean("format", Format.class);
		
		format.printFormat();
		
		System.out.println(format.hashCode());
	} 

}
