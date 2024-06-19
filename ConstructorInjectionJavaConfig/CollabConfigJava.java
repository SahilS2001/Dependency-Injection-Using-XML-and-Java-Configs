package com.ConstructorInjectionJavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollabConfigJava {
	
	@Bean(name= "employee")
	public Employee getEmployeeBean() {
		
		return	new Employee(101, "Ajinkya", "Project Manager", 793833.40, new Department());
			
	}
	
	@Bean(name = "department")
	public Department getDepartmentBean() {
		
		return new Department(002, "Deployment");
	}
}
