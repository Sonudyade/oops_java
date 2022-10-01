package com.QAcircle.Myproject.dto;

import com.QAcircle.Myproject.dao.WatchDAO;

public class Test {
public static void main(String[] args) {
		
		
		String[] features = {"calling","sport"};
		
		SmartWatchDTO watch =new SmartWatchDTO();
		watch.setBrandName("BOAT");
		watch.setColor("gray");
		watch.setPrice(1000);
		watch.setDisplay("LED");
		watch.setFeatures(args);
		
		
		SmartWatchDTO watch1= new SmartWatchDTO();
		watch1.setBrandName("realme");
		watch1.setColor("black");
		watch1.setPrice(1000);
		watch1.setDisplay("LED");
		watch1.setFeatures(args);
	
		
		WatchDAO dao = new WatchDAO();
	    dao.save(watch);
		
		
	     String response=dao. deleteByBrandName("boat");
	     System.out.println(response);
	     
	     String display=dao.deleteByColor("Black");
	     System.out.println(display);
	     
	     String print =dao.deleteDisplay("LED");
	     System.out.println(print);
	     
	     System.out.println(getBrandName());
	     String getColor = "Black";
		System.out.println(getColor);
	    	  
	      }

private static String getBrandName() {

	return "boat";
}
public void print() {
	String brandName = "boat";
	System.out.println(brandName);
}
	     
	     
	    
	}
