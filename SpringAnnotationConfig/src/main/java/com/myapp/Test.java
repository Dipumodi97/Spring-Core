package com.myapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
	  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	  context.scan("com.*");
	  context.refresh();
	  
	  System.out.println();
	}
}
