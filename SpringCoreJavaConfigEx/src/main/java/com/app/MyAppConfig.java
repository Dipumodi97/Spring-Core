package com.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {

	// 1 method = 1 object
	
	@Bean
	public DriverManager conObj() {
		// Write normal java object
		
		DriverManager dm = new DriverManager();
		
		dm.setDriverClass("MySql");
        dm.setUrl("jdbc:mysql");
        
        return dm;
	}
}
