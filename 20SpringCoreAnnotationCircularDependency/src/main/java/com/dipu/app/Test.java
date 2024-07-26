package com.dipu.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee emp = context.getBean("employee",Employee.class);
		emp.setName("Rahim");
		Project project = emp.getProj();
		project.setCode("CIS123");
		System.out.println(project);
		System.out.println(emp);
	}

}
