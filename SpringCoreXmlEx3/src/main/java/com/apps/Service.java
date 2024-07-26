package com.apps;

public class Service {

	private Repository repository;

	public Repository getRepository() {
		return repository;
	}

	public void setRepository(Repository repository) {
		this.repository = repository;
	}

	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Service [repository=" + repository + "]";
	}
	
	
}
