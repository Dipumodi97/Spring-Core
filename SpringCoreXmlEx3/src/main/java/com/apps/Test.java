package com.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
       ApplicationContext context =  
    		   new ClassPathXmlApplicationContext("config.xml");
       Controller controller = (Controller) context.getBean("controller");
       System.out.println(controller  );
	}
}
 