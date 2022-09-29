package com.QAcircle.Myproject.dao;

import com.QAcircle.Myproject.dto.VivoMobileDTO;

public class MobileDAO {
private VivoMobileDTO[] VivoMobiles = new VivoMobileDTO[10];
	
	public void save(VivoMobileDTO mobile) {
		VivoMobiles[0]=mobile;
	}
	public String deleteByBrandName(String brandName){
		
		for ( int i=0; i<VivoMobiles.length;i++) {
			if(VivoMobiles[i]!= null&&VivoMobiles[i].getBrandName().equals(brandName)) {
				VivoMobiles[i]=null;
				return"Deleted"+brandName;
			}
			
		}
		return"brandName"+brandName+"not present";
		
		
	}
	public String deleteByColor(String color) {
		if(VivoMobiles[0]!= null&&VivoMobiles[0].getColor().equals(color)) {
			VivoMobiles[0]=null;
			return"Deleted"+color;
		}
		
	
	return"color"+color+"not present";
	
		
		
	}
	public String deleteByPrice(int price) {
		if(VivoMobiles[0]!= null&&VivoMobiles[0].getColor().equals(price)) {
			VivoMobiles[0]=null;
			return"Deleted"+price;
		}
		
	
	return"price"+price+"not present";
	

}
	public String deleteByFeatures(String features[]) {
		if(VivoMobiles[0]!= null&&VivoMobiles[0].getFeatures().equals(features)) {
			VivoMobiles[0]=null;
			return"Deleted"+features;
		}
		
	
	return"features"+features+"not present";
	

}
}

