package com.ConstructorInjectionJavaConfig;

public class Department {
	private int deptId;
	private String deptName;
	
	public Department() {
		
	}

	

	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}



	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
	
}
