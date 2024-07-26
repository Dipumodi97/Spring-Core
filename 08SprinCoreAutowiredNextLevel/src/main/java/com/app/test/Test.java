package com.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.MyConfig;
import com.app.controller.MyController;

public class Test {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(MyConfig.class);
		
		MyController mc = context.getBean("myController",MyController.class);
		System.out.println(mc);
	}

}
