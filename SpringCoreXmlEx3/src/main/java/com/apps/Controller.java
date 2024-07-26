package com.apps;

public class Controller {

	private Service service;

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Controller [service=" + service + "]";
	}
           
}
