package com.dipu.app.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dipu.app.dbCon.MyDbCon;

@Component
public class DbTestRunner implements CommandLineRunner{

	@Autowired
	private MyDbCon con;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(con);
		
	}
}
