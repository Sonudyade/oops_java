package com.qac.corejava.oops.Abstraction.Upcasting.dto;

public class StudentDto extends EnglishTeacherDto{
	private String name="Rashi";
	private byte RollNo=25;
	
	public StudentDto() {
		System.out.println("Invoking Student constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte getRollNo() {
		return RollNo;
	}
	public void setRollNo(byte RollNo) {
		this.RollNo=RollNo;
	}

}
