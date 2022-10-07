package com.QAcircle.Myproject.dao;
import com.QAcircle.Myproject.dto.FaceBook;

public class DAo {
	
	
	
	private FaceBook[] facebook = new FaceBook[10];
	private Object getPassword;
	public void login(FaceBook app) {
		facebook[0]=app;
	}
	
	
	public  String loginByEmailpassword(String email, String password) {
		for(int i =0;i<facebook.length; i++) {
			if(facebook[i]!=null&&facebook[i].getEmail().equals(email)&&facebook[i]!=null&&getPassword.equals(password)) {
				facebook[i]=null;
				return ("facebook login sucess");
			}
		}
		return "facebook login fail";
		
	}
	
	public  String RegisterByName(String name) {
		for (int i=0; i< facebook.length; i++) {
			
			if(facebook[i]!= null&&facebook[i].getName().equals(name)) {
				facebook[i]=null;
				return("Register succes");
			}
		}
		return "Not Register";
	}
		
	public String deleteByEmailpassword(String email, String password) {
		for(int i =0;i<facebook.length; i++) {
			if(facebook[i]!=null&&facebook[i].getEmail().equals(email)&&facebook[i]!=null&&getPassword.equals(password)) {
				facebook[i]=null;
				return ("facebook delete sucess");
			}
		}
		return "facebook delete fail"; 
			}

}
			
			

