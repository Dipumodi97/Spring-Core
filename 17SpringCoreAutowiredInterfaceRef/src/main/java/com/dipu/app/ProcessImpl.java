package com.dipu.app;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class ProcessImpl implements IProcess{

	@Override
	public void getProcess() {
		// TODO Auto-generated method stub
		System.out.println("P1");
		
	}

}
