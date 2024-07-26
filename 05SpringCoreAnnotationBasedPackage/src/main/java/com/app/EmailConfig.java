package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eobj")
public class EmailConfig {
	
	@Value("${email.host:gmail}")
	private String host;
	@Value("${email.port:9645}")
	private Integer port;
	
	@Override
	public String toString() {
		return "EmailConfig [host=" + host + ", port=" + port + "]";
	}

	
	public EmailConfig() {
		// TODO Auto-generated constructor stub
		super();
	}

}
