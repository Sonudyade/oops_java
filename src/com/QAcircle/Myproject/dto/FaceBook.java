package com.QAcircle.Myproject.dto;

public class FaceBook extends  Details {
	
	private String email;
	private String password;
	public int length;
	
	public FaceBook() {
		System.out.println("Invoking FaceBook constructor");
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email= email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password= password;
	}

}
