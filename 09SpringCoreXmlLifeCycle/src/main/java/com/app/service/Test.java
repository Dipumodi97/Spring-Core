package com.app.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		Object bean = ac.getBean("eobj");
		System.out.println(bean);
		
		ac.close();
	}

}
