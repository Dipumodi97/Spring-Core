package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myDb")
public class MyDatabase {

	@Autowired
	@Qualifier("dmObj")
	private DriverManager dm;

	public DriverManager getDm() {
		return dm;
	}

	public void setDm(DriverManager dm) {
		this.dm = dm;
	}

	public MyDatabase(DriverManager dm) {
		super();
		this.dm = dm;
	}

	@Override
	public String toString() {
		return "MyDatabase [dm=" + dm + "]";
	}
	
	
}
