package com.dipu.app;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.dipu.app.refType.Process;

@Component
@ConfigurationProperties("my.app")
public class MyServiceData {

	private int id;
	private String code;

	private List<String> data;

//	private Set<String> data;
//	private String[] data;

	private Map<String, String> info;

	private Process pob;

	public Process getPob() {
		return pob;
	}

	public void setPob(Process pob) {
		this.pob = pob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<String> getData() {
		return data;
	}

	public void setData(List<String> data) {
		this.data = data;
	}

	public Map<String, String> getInfo() {
		return info;
	}

	public void setInfo(Map<String, String> info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "MyServiceData [id=" + id + ", code=" + code + ", data=" + data + ", info=" + info + ", pob=" + pob
				+ "]";
	}

}
