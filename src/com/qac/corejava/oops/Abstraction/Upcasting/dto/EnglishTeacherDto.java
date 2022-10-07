package com.qac.corejava.oops.Abstraction.Upcasting.dto;

public class EnglishTeacherDto {
	
	private String name ="Basavaraj";
	private byte age =35;
	
	public EnglishTeacher() {
		System.out.println("Invoking EnglishTeacher constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age=age;
	}

}
