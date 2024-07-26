package com.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;


// we can write annotation in any order
@ComponentScan(basePackages = "com.app")
@PropertySource("classpath:myapp.properties")
public class myAppConfig {

}
