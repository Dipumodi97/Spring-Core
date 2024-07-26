package com.app.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("con")
public class DbConnection {

	@Value("${my.grade.add }")
	private Integer code;
	// $ indicates key value
	@Value("${my.db.driver}")
	private String driver;
	@Value("${my.db-url}")
	private String url;
	@Value("${my.db_user}")
	private String userName;
	@Value("${my.db-pwd}")
	private String pwd;
	@Override
	public String toString() {
		return "DbConnection [code=" + code + ", driver=" + driver + ", url=" + url + ", userName=" + userName
				+ ", pwd=" + pwd + "]";
	}
	
	
	
	
}
