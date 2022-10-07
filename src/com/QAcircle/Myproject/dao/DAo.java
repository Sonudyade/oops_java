package com.QAcircle.Myproject.dao;
import com.QAcircle.Myproject.dto.FaceBook;

public class DAo {
	
	private static final FaceBook Facebook = null;
	private static final Object Email = null;
	FaceBook[] facebook = new FaceBook[1];
	
	
	public  String login(FaceBook app) {
		int index = 0;
          facebook[index ++ ]=( Facebook);
		return ("Login");

	}
	
	public  String Register(FaceBook app) {
		for (int i=0; i< facebook.length; i++) {
			Object email = "sonudyade46@gmail.com";
			Object password = "Sonu46";;
			Object getEmail = "sonudyade46@gmail.com";
			Object getPassword = "Sonu46";
			if(facebook[i]!= null&&getEmail.equals(email)&& facebook[i]!=null&&getPassword.equals(password)) {
			}
		
				else 
					System.out.println("login sucess");
				}
		return ("facebook login sucess");
		}
	public String delete(FaceBook app) {
		for (int i=0; i< facebook.length; i++) {
			Object email= "sonudyade46@gmail.com";
			Object password = "Sonu46";
			Object getEmail = "sonudyade46@gmail.com";
			Object getPassword = "Sonu46";
			if(facebook[i]!=null&&getEmail.equals(Email)&& facebook[i].getPassword.equals(password)) {
				return delete(app);
			}
			System.out.println("deleted");
		
	}
		return ("delete created account");
		
		
	}
			}
			
			

