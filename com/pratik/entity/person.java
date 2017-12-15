package com.pratik.entity;

public abstract class person {

	private int perId;
	private String perName;
	public employee emp;
	
	
	public int getPerId() {
		return perId;
	}
	public void setPerId(int perId) {
		this.perId = perId;
	}
	public String getPerName() {
		return perName;
	}
	public void setPerName(String perName) {
		this.perName = perName;
	}
	//creating abstract method for the lookup method
	public abstract employee getOb();
	public employee getemp(){
		emp=getOb();
		return 	emp;
		
	}
	@Override
	public String toString() {
		return "person [perId=" + perId + ", perName=" + perName + "]";
	}
	
}
