package com.setterInjectionJavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollabConfigJava {
	
	@Bean(name= "employee")
	public Employee getEmployeeBean() {
		
		return	new Employee();
			
	}
	
	@Bean(name = "department")
	public Department getDepartmentBean() {
		
		return new Department();
	}
}
