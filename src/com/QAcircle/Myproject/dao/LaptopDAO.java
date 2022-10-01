package com.QAcircle.Myproject.dao;

import com.QAcircle.Myproject.dto.HPLaptopDTO;

public class LaptopDAO {
	
	private HPLaptopDTO[] hplaptopes=new  HPLaptopDTO[10];

	
	public void save( HPLaptopDTO laptop) {
		hplaptopes[0]= laptop;
	}
	public String deleteByBrandName(String brandName) {
		
		
		for(int i=0; i<hplaptopes.length;i++) {
			if (hplaptopes[i]!=null&&hplaptopes[i].getBrandName().equals(brandName)) {
				hplaptopes[i]=null;
				return"deleted" + brandName;
			}
		}
		return"brandName"+brandName+"not present";
		
	}
	public String deleteByColor(String color) {
		if (hplaptopes[0]!=null&&hplaptopes[0].getColor().equals(color)) {
			hplaptopes[0]=null;
			return"deleted" + color;
		}
	
	return "color" +color+ "not present";
}
	public String deleteByFeatures(String []features) {
		if (hplaptopes[0]!=null&&hplaptopes[0].getFeatures().equals(features)) {
			hplaptopes[0]=null;
			return"deleted" + features;
		}
	
	return "features" +features+ "dont show present";
	
}
	public String deleteByCost(int cost) {
		if (hplaptopes[0]!=null&&hplaptopes[0].getCost().equals(Cost)) {
			hplaptopes[0]=null;
			return"deleted" + cost;
		}
	
	return "Cost" +cost+ "not present";
	}
	public void print() {
		for(int i=0; i<hplaptopes.length;i++) {
			System.out.println(hplaptopes[0].getBrandName());
			System.out.println(hplaptopes[0].getColor());
			System.out.println(hplaptopes[0].getCost());
			System.out.println(hplaptopes[0].getFeatures());
		}
	}
}
