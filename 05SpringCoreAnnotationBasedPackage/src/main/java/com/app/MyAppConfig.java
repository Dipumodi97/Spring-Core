package com.app;

import org.springframework.context.annotation.ComponentScan;

//@ComponentScan({"com.app","test.one","abc.xyz"})
//@ComponentScan("com.app")

@ComponentScan(basePackages = "com.app")
public class MyAppConfig {

}
