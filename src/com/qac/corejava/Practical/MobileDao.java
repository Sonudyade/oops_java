package com.qac.corejava.Practical;

import java.util.HashSet;

import com.qac.corejava.Collection.set.HashSet.BankAccountDtailsDTO;

public class MobileDao {
	
	HashSet<MobileDto>set = new HashSet<MobileDto>();
	private Object serialNumber;
	
	public boolean save(MobileDto dto) {
		set.add(dto);
	  return dto.getModelName()+"data saved" != null;
	
	}

	
	public MobileDto deleteByMobileId(int mobileId) {
		
		for(  MobileDto object:set){
			if (object.getMobileId().equals(mobileId)) {
				return object;

	}
		}
		return null;
	}
	public MobileDto updateBySerialNumber(int mobileId) {
		
		for(  MobileDto object:set){
			if (object.getSerialNumber().equals(serialNumber)) {
				return object;

	}
		}
		return null;
}   
public MobileDto getAllByBrandName(String brandName) {
		
		for(  MobileDto object:set){
			if (object.getBeandName().equals(brandName)) {
				return object;

	}
		}
		return null;
}
 public void getAll() {
	 



		
	

}
}