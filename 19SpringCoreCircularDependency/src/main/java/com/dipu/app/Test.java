package com.dipu.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	    public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		Employee employee = ac.getBean("emp",Employee.class);
		System.out.println(employee);
	}
}
