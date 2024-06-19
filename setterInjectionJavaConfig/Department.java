package com.setterInjectionJavaConfig;

public class Department {
	private int deptId;
	private String deptName;
	
	public Department() {
		
	}

	

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
	
}
