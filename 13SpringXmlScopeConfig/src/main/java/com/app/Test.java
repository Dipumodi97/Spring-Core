package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		Token token = ac.getBean("t1",Token.class);
		System.out.println(token.hashCode());
		Token token1 = ac.getBean("t1",Token.class);
		System.out.println(token1.hashCode());
		System.out.println(token1);
	}

}
