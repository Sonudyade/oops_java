package com.QAcircle.Myproject.dto;

public class Details {
	private String name;
	private String gender;
	private String password;
	private String Cnfpassword;
	private String email;
	private long moNo;
	public Object getEmail;
	public Object getPassword;
	
	
	
	public Details() {
		System.out.println("Invoking Details constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gendet) {
		this.gender= gender;
	}
	public String getPassword() {
		return password;
	}
	public void  setPassword(String password) {
		this.password= password;
	}
	public String getCnfpassword() {
		return Cnfpassword;
	}
	public void setCnfpassword(String Cnfpassword) {
		this.Cnfpassword =Cnfpassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMoNo() {
		return moNo;
	}
	public void setMoNo(long moNo) {
		this.moNo= moNo;
	}

}
