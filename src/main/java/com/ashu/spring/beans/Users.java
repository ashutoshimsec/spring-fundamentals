package com.ashu.spring.beans;

public class Users {

	private String name;
	private String age;
	private Gender gender;
	private String address;
	private Employee employee;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Users [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + ", employee="
				+ employee + "]";
	}
	
	

	
	
}
