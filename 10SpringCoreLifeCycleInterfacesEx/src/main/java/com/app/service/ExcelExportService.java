package com.app.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExcelExportService implements InitializingBean,DisposableBean{

	private String fileName;
	
	private String mode;
	
	@Override
	public void destroy() throws Exception {
		System.out.println("FORM DESTROY CALLED");
		
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("INIT METHOD CALLED");
		
	}
	


	@Override
	public String toString() {
		return "ExcelExportService [fileName=" + fileName + ", mode=" + mode + "]";
	}


	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public String getMode() {
		return mode;
	}


	public void setMode(String mode) {
		this.mode = mode;
	}


	public ExcelExportService() {
		super();
		System.out.println("CONSTRUCTOR FROM SUPERCLASS");
	}



	
	

}
