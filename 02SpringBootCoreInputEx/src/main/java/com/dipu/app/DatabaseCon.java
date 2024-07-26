package com.dipu.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseCon {

	@Value("${my.db.driver}")
	private String driver;
	@Value("${my.db.url}")
	private String url;
	@Value("${my.db.username}")
	private String user;
	@Value("${my.db.pwd}")
	private String pwd;
	
	
	@Override
	public String toString() {
		return "DatabaseCon [driver=" + driver + ", url=" + url + ", username=" + user + ", pwd=" + pwd + "]";
	}
	
	
}
