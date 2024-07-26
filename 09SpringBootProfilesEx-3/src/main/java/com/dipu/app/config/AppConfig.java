package com.dipu.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.dipu.app.service.PdfExportservice;

@Configuration
public class AppConfig {

	@Bean
	@Profile("qa")
	public PdfExportservice pdf() {
		PdfExportservice ps = new PdfExportservice();
		ps.setFileExt(".pdf");
		ps.setFtype("Documentation");
		return ps;
	}
}
