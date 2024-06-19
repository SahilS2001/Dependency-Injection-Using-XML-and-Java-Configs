package com.setterInjectionXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTestContainer {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("CollabConfigsetterInj.xml");
		
		
		Department department= (Department)context.getBean("department1");
		System.out.println(department);
		
		System.out.println("---------------------------");
		
		Employee employee = (Employee)context.getBean("employee");
		System.out.println(employee);
		

	}

}
