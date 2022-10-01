package com.QAcircle.Myproject.dao;

import com.QAcircle.Myproject.dto.SmartWatchDTO;

public class WatchDAO {
private SmartWatchDTO[]smartWatches =new SmartWatchDTO[10];
	
	public void save(SmartWatchDTO watch) {
		smartWatches[0]= watch;
	}
	public String deleteByBrandName(String brandName) {
		
		for(int i= 0; i<smartWatches.length; i++) {
			if(smartWatches[i]!=null&&smartWatches[i].getBrandName().equals(brandName)) {
				smartWatches[i]=null;
				return"Deleted"+ brandName;
			}
		}
         return "brandName"+brandName +"not present";
	}
	
	public String deleteByColor(String color) {
		if(smartWatches[0]!=null&&smartWatches[0].getColor().equals(color)) {
			smartWatches[0]=null;
			return"Deleted"+ color;
		}
	
	return "color"+color +"not present";
		
	}
	
	public String deleteDisplay(String Display) {
		if(smartWatches[0]!=null&&smartWatches[0].getDisplay().equals(Display)) {
				smartWatches[0]=null;
				return"Deleted"+ Display;
		
	}
	


		return "display"+Display +"not present";
	}
	
	public void print() {
		for(int i= 0; i<smartWatches.length; i++) {
			System.out.println(smartWatches[i].getBrandName());
			System.out.println(smartWatches[i].getColor());
			System.out.println(smartWatches[i].getDisplay());
			System.out.println(smartWatches[i].getPrice());
			System.out.println(smartWatches[i].getFeatures());
		
		
	}
}
}
