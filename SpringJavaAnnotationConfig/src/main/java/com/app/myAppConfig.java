package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:bean.properties")
public class myAppConfig {
	
	@Autowired
	private Environment environment;
	
	@Bean
	public MyDriver objConfig() {
		
		MyDriver md = new MyDriver();
		
		md.setDriver(environment.getProperty("my.driver"));
		md.setUrl(environment.getProperty("my.url"));
	
		return md;
	}

}
