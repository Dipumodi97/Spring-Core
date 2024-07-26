package com.app.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		Object object = ac.getBean("eobj");
		
		System.out.println(object);
		
		ac.close();
	}

}
