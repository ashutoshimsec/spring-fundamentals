package com.ashu.spring.beans;

public class Employee {

	private String employeeId;
	private String designation;
	private String companyId;
	private String comapnyName;
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getComapnyName() {
		return comapnyName;
	}
	public void setComapnyName(String comapnyName) {
		this.comapnyName = comapnyName;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", designation=" + designation + ", companyId=" + companyId
				+ ", comapnyName=" + comapnyName + "]";
	}
	
	
}
