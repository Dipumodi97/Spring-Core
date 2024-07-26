package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyService {

	@Autowired(required = false)
//	@Qualifier("m2")
	private MyRepository repo;

	@Override
	public String toString() {
		return "MyService [repo=" + repo + "]";
	}

	public MyRepository getRepo() {
		return repo;
	}

	public void setRepo(MyRepository repo) {
		this.repo = repo;
	}
	
	
}
