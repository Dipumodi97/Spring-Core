package com.dipu.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dipu.app.Token;
import com.dipu.app.config.AppConfig;
import com.dipu.app.service.TokenService;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		 TokenService tokenService = context.getBean("t1",TokenService.class);
		 Token token = tokenService.getToken();
		 System.out.println(token.hashCode()+" "+tokenService.hashCode());
		 
		 TokenService tokenService1 = context.getBean("t1",TokenService.class);
		 Token token1 = tokenService.getToken();
		 System.out.println(token1.hashCode()+" "+tokenService1.hashCode());
	}
}
