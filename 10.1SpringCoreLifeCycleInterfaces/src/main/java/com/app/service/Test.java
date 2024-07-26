package com.app.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.config.MyConfig;

public class Test {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(MyConfig.class);
		Object object = context.getBean("eob");
		System.out.println(object);
		context.close();
	}
	
	public static void main1(String[] args) {
		ClassPathXmlApplicationContext ac = 
				new ClassPathXmlApplicationContext("config.xml");
		
		Object object = ac.getBean("eobj");
		System.out.println(object);
		
		ac.close();
	}

}
