package com.QAcircle.Myproject.dto;

import com.QAcircle.Myproject.dao.LaptopDAO;

public class TestLaptop {
	public static void main(String[] args) {
		
		
		String[] features = {"Display","Storage"};
		
		HPLaptopDTO laptop= new HPLaptopDTO();
		laptop.setBrandName("HP");
		laptop.setColor("Silver");
		laptop.setCost(40000);
		laptop.setFeatures(args);
		
		HPLaptopDTO laptop1= new HPLaptopDTO();
		laptop1.setBrandName("DEll");
		laptop1.setColor("Black");
		laptop1.setCost(40000);
		laptop1.setFeatures(args);
		
		LaptopDAO dao = new LaptopDAO();
		dao.save(laptop);
		
		String response= dao.deleteByBrandName("DEll");
		System.out.println(response);
		
		String show= dao.deleteByColor("Black");
		System.out.println(show);
		
		String display=dao.deleteByFeatures(args);
		System.out.println(display);
		
		String print=dao.deleteByCost(40000);
		System.out.println(print);
	}

}
