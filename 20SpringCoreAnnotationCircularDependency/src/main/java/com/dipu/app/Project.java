package com.dipu.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Project {
    
    private String code;
    
    @Autowired
    private Employee emp;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "Project [code=" + code + ", emp=" + emp + "]";
    }

    public Project() {
        // Default constructor
    }
}
