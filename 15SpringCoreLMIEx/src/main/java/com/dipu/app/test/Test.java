package com.dipu.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dipu.app.Token;
import com.dipu.app.config.AppConfig;
import com.dipu.app.service.TokenService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		// Reading First Time
		TokenService tokenService = ac.getBean("t1",TokenService.class);
		Token token = tokenService.getToken();
		System.out.println(tokenService.hashCode()+"  "+token.hashCode());
		
		// Reading Second Time
		TokenService tokenService1 = ac.getBean("t1",TokenService.class);
		Token token1 = tokenService.getToken();
		System.out.println(tokenService1.hashCode()+"  "+token1.hashCode());
	}
}
