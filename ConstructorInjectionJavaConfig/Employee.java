package com.ConstructorInjectionJavaConfig;

public class Employee {
	private int employeeId;
	private String employeeName;
	private String employeeRole;
	private double employeeSalary;
	
	public Department department;
	
	

	public Employee(int employeeId, String employeeName, String employeeRole, double employeeSalary,
			Department department) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeRole = employeeRole;
		this.employeeSalary = employeeSalary;
		this.department = department;
	}



	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeRole="
				+ employeeRole + ", employeeSalary=" + employeeSalary + ", department=" + department + "]";
	}

	
	
	

}
