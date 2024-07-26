package com.dipu.app.dbCon;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component // to create the object
@Data  // to generate set/get and all...
@ConfigurationProperties("my.app") // loading the key-values...
public class MyDbCon {

	private String driver;
	private String url;
	private String username;
	private String pwd;
}
