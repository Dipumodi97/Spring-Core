package com.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.app.DriverManager;

@Configuration
@ComponentScan(basePackages = "com.app")
@PropertySource("classpath:beans.properties")
public class MyAppConfig {

	@Autowired
	private Environment env;
	
	@Bean
	@Primary
	public DriverManager dmObj1() {

		DriverManager dm2 = new DriverManager();
		dm2.setDriver("MongoDb");
		dm2.setUrl("mongoDB:thin");

		return dm2;
	}

	@Bean
	public DriverManager objDriver() {

		DriverManager dm = new DriverManager();
		dm.setDriver(env.getProperty("my.driver"));
		dm.setUrl(env.getProperty("my.url"));
		return dm;
	}

	@Bean
	public DriverManager dmObj() {

		DriverManager dm1 = new DriverManager();
		dm1.setDriver("OracleDriver");
		dm1.setUrl("Oracle:thin");

		return dm1;
	}

}
