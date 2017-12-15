package com.pratik.entity;

public class employee extends person {

	private int empId;
	private String empName;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "employee [empId=" + empId + ", empName=" + empName + "]";
	}
	@Override
	public employee getOb() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
