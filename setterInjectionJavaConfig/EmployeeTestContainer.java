package com.setterInjectionJavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class EmployeeTestContainer {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollabConfigJava.class);
		
		
		Department department= (Department)context.getBean("department");
		
		
		department.setDeptId(20);
		department.setDeptName("Support");
		System.out.println(department);
		
		System.out.println("-----------------------");
		
		
		Employee employee = (Employee)context.getBean("employee");
		
		
		employee.setEmployeeId(202);
		employee.setEmployeeName("Prabhas");
		employee.setEmployeeRole("Developer");
		employee.setEmployeeSalary(567879.44);
		
		employee.setDepartment(department);
		System.out.println(employee);
		

	}

}
