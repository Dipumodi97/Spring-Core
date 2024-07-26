package com.app;

public class MyDriver {

	private String driver;

	private String url;

	@Override
	public String toString() {
		return "MyDriver [driver=" + driver + ", url=" + url + "]";
	}

	public MyDriver() {
		super();
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
