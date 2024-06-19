package com.ConstructorInjectionJavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class EmployeeTestContainer {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollabConfigJava.class);
		
		
		Department department= (Department)context.getBean("department");
		System.out.println(department);
		
		System.out.println("-----------------------");
		
		
		Employee employee = (Employee)context.getBean("employee");	
		System.out.println(employee);
		

	}

}
