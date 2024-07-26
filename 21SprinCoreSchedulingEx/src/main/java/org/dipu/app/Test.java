package org.dipu.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConig.class);
		
//		ProductReportService prs = 
//				context.getBean("productReportService",ProductReportService.class);
		
		/*
		 * If ProductReportService have only object then,
		 * productReportService is optional
		 */
		ProductReportService prs = context.getBean(ProductReportService.class);
		
		System.out.println(prs);
	 	
	}
}
