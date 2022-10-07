package com.QAcircle.Myproject.dto;
import com.QAcircle.Myproject.dao.DAo;

public class TestDetails {
	private static final Object[] FaceBook = null;
	private static FaceBook Facebook = null;

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
		
		
		
		DAo dao2= new DAo();
		dao2.Register(app);
		
		DAo dao3= new DAo();
		dao3.delete(app);
		
		String Show = dao1.login(Facebook );
		System.out.println(Show);
		
		
		String Display = dao2.Register(Facebook );
		System.out.println(Display);
		
		String Print = dao3.delete(Facebook );
		System.out.println(Print);
	}
		
		public void print() {
			for (int i=0; i< Facebook.length; i++) {
				System.out.println(((Details) FaceBook[1]).getName());
				System.out.println(((Details) FaceBook[1]).getGender());
			
			
	
		}
		
		
		
		

		
		
		
		
		
	}

}


