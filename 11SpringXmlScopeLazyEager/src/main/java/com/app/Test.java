package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	 public static void main(String[] args) {
		 System.out.println("");
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		Token token = ac.getBean("token",Token.class);
		System.out.println(token.hashCode());
		Token token1 = ac.getBean("token",Token.class);
		System.out.println(token1.hashCode());
	}

}
