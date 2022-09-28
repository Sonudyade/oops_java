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

}
