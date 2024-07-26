package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.repo.MyRepo;

@Component
public class MyService {
	
	@Autowired
	private MyRepo repo;// HAS-A Relation

	@Override
	public String toString() {
		return "MyService [repo=" + repo + "]";
	}
	
	

}
