package com.app.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eob")
public class ExcelExport {

	@Value("dipu")
	private String fileName;

	@Value(".jpg")
	private String mode;

	@PostConstruct
	public void initInitialize() {
		// lot of code.....
		System.out.println("INITIALIZE INIT METHOD");
	}

	@PreDestroy
	public void clean() {
		// lot of code.....
		System.out.println("USING DESTROY METHOD");
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;

		System.out.println("FROM SETTER METHOD");
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	@Override
	public String toString() {
		return "ExcelExport [fileName=" + fileName + ", mode=" + mode + "]";
	}

	public ExcelExport() {
		super();
		System.out.println("FROM CONSTRUCTOR");
	}
}
