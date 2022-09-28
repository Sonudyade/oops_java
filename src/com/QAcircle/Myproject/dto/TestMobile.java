package com.QAcircle.Myproject.dto;

import com.QAcircle.Myproject.dao.MobileDAO;

public class TestMobile {
public static void main(String[] args) {
		
		
		String[] features= {"Photo","Music"};
		
		
		VivoMobileDTO mobile = new VivoMobileDTO ();
		mobile.setBrandName("Vivo");
		mobile.setColor("black");
		mobile.setPrice(25000);
		mobile.setFeatures(args);
		
		VivoMobileDTO mobile1 = new VivoMobileDTO ();
		mobile1.setBrandName("Iphone");
		mobile1.setColor("black");
		mobile1.setPrice(50000);
		mobile1.setFeatures(args);
		
		MobileDAO dao = new MobileDAO();
		dao.save(mobile1);
		
		String response= dao.deleteByBrandName("Vivo");
		System.out.println(response);
		

		
		
	}


}
