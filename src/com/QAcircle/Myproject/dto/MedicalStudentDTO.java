package com.QAcircle.Myproject.dto;

public class MedicalStudentDTO extends StudentDTO{
	
	private int year;
	private long MoNo;
	private String Dept;
	
	public MedicalStudentDTO (){
		System.out.println("Invoking MedicalStudentDTO constructor");
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public long getMoNo() {
		return MoNo;
	}
	public void setMoNo(long MoNo) {
		this.MoNo=MoNo;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String Dept) {
		this.Dept= Dept;
	}

}
