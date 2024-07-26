package com.dipu.app;

import org.springframework.stereotype.Component;

@Component("pob")
public class AdvanceProcessImpl implements IProcess{

	@Override
	public void getProcess() {
		// TODO Auto-generated method stub
		System.out.println("P2");
	}

}
