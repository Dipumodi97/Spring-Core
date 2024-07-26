package com.app.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("eobj")
public class ExcelExportService {

	private String fileName;

	private String mode;

	@PostConstruct
	public void initInitialize() {
		// lot of code.....
		System.out.println("FROM INIT METHOD");
	}

	@PreDestroy
	public void clean() {
		// lot of code.....
		System.out.println("FROM DESTROY METHOD");
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
		return "ExcelExportService [fileName=" + fileName + ", mode=" + mode + "]";
	}

	public ExcelExportService() {
		super();
		System.out.println("FROM CONSTRUCTOR ");
	}

}
