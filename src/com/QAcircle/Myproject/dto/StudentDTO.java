package com.QAcircle.Myproject.dto;

public class StudentDTO {
	
	private String name;
	private int age;
	private String Address;
	
	public StudentDTO() {
		System.out.println("invoking StudentDTO constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		this.name= name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age= age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
		this.Address= Address;
	}

}
