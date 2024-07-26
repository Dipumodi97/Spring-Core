package com.dipu.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    private String name;
    
    @Autowired
    private Project proj;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Project getProj() {
        return proj;
    }

    public void setProj(Project proj) {
        this.proj = proj;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", proj=" + proj + "]";
    }
    
    public Employee() {
        // Default constructor
    }
}
