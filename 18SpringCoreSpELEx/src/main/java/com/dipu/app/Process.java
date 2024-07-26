package com.dipu.app;

import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Process {
	//@Value("#{2+3}")
	//@Value("#{'Hello Dipu'.length()}")
	//@Value("#{new java.util.Random().nextInt()}")
	//@Value("#{T(java.lang.Math).abs()}")
	//@Value("#{T(java.lang.Math).abs(new java.util.Random().nextInt())}")
	//@Value("#{'hello'.length()>0?55:30}")
	
	//@Value("#{modelData.model.length()}")
	private int code;
	
	
	//@Value("#{modelData.model.toUpperCase()}")
	@Value("#{modelData.model.toUpperCase().replace('T','A')}")
	private String code1;


	//@Value("#{false}")
	//@Value("#{new java.util.Random().nextInt()>5?true:false }")
	//@Value("#{T(java.lang.Math).abs(new java.util.Random().nextInt())>5?true:false }")
	//@Value("#{new java.util.Random().nextInt() ge 5?true:false }")
	   // gt define greaterThan, ge define greater than equal to
	//@Value("#{5%2>0 && 2+3 <= 5 }")
	@Value("#{5 mod 2 gt 0 and 2+3 le 5 }")
	
	private boolean isPresent;
	
	@Value("#{modelData.model.getBytes()}")
	private byte[] arr;
	
	@Value("#{modelData.model.toCharArray()}")
	private char[] data;
	
	@Value("#{'Hello Dipu!'.toCharArray()}")
	private char[] users;
	
	// To convert an another class object data to Stream format
	@Value("#{modelData.model.lines()}")
	private Stream<String> stream;


	@Override
	public String toString() {
		return "Process [code=" + code + ", code1=" + code1 + ", isPresent=" + isPresent + ", arr="
				+ Arrays.toString(arr) + ", data=" + Arrays.toString(data) + ", users=" + Arrays.toString(users)
				+ ", stream=" + stream + "]";
	}
	
	
}
