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

}
