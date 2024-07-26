package com.dipu.app.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
@Profile({"qa","default"})
public class ExportExcelService {

	@Value("CSV")
	private String extCode;
	
	@Value("#{new java.util.Random().nextInt()}")
	private Integer formatId;
}
