package com.dipu.app.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dipu.app.service.ExportExcelService;
import com.dipu.app.service.PdfExportservice;

@Component
public class TestObjRunner implements CommandLineRunner {

	@Autowired
	private ExportExcelService es;
	
	@Autowired
	private PdfExportservice ps;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(es);
		System.out.println(ps);

	}

}
