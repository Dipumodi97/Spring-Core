package com.app;

public class DriverManager {
	
	private String driver;
	
	private String url;

	public DriverManager(String driver, String url) {
		super();
		this.driver = driver;
		this.url = url;
	}
	
	public DriverManager() {
		super();
	}

	@Override
	public String toString() {
		return "DriverManager [driver=" + driver + ", url=" + url + "]";
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	

}
