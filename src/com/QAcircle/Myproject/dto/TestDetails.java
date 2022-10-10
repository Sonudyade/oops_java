

package com.QAcircle.Myproject.dto;
import com.QAcircle.Myproject.dao.DAo;
import com.QAcircle.Myproject.dto.FaceBook;


public class TestDetails {
	

	public static void main(String [] args) {
		FaceBook app = new FaceBook();
		app.setName("Sony");
		app.setGender("Female");
		app.setPassword("Sonu@46");
		app.setCnfpassword("Sonu@46");
		app.setEmail("sonudyade46@gmail.com");
		app.setMoNo(973102506);
		
		
		DAo dao1= new DAo();
		dao1.login(app);
		
		String response=dao1. RegisterByName("Sony");
		System.out.println(response);
		
		String show=dao1. loginByEmailpassword("sonudyade46@gmail.com","Sonu@46");
		System.out.println(show);
		
		String print=dao1.deleteByEmailpassword("sonudyade46@gmail.com","Sonu@46");
		System.out.println(print);
	}
	

		
		
			
	
		
		
		
		
		

		
		
		
		
		
	}


