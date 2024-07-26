package com.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.MyAppConfig;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyAppConfig.class);

		Object object = context.getBean("objDriver");
		System.out.println(object);
		Object object1 = context.getBean("myDb");
		System.out.println(object1);
	}

	public static void main2(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyAppConfig.class);

		Object object = context.getBean("myDb");
		System.out.println(object);
	}

	public static void main1(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);

		Object object = ac.getBean("objDriver");
		System.out.println(object);
	}

}
