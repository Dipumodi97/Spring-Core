package org.dipu.app;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ProductReportService {

	//@Scheduled(fixedDelay =2000)
	//@Scheduled(fixedDelayString = "2000")
	//@Scheduled(fixedRate = 2000)
	@Scheduled(cron = "10 * * * * *")
	public void generateReport() {
		
		System.out.println("Hello Akshat, Your time Start now..."+ new Date());
	}
}
