package com.qac.corejava.Collection.set.HashSet.DAO;

import java.util.HashSet;

import com.qac.corejava.Collection.set.HashSet.DTO.AddressDto;
import com.qac.corejava.Collection.set.HashSet.DTO.CompanyDto;

public class CompanyAddressDAO {
	
	
	HashSet<CompanyDto> com=new HashSet<CompanyDto>();
	HashSet<CompanyAddressDAO> set = new HashSet<CompanyAddressDAO>();
	
	public String save(CompanyDto dto) {
		com.add(dto);
		return null;
	}
	public CompanyDto searchBynoOfEmployee(int noOfEmployee) {
		for(CompanyDto object:com) {
			if(object.getCountry().equals(noOfEmployee)) {
				return object;
			}
		}
		return null;
	}
	public CompanyDto searchByCountry(String country) {
		for(CompanyDto object:com) {
			if(object.getCountry().equals(country)) {
				return object;
			}
		}
		return null;
	}
	public CompanyDto searchByState(String State) {
		for(CompanyDto object:com) {
			if(object.getState().equals(State)) {
				return object;
			}
		}
		return null;
	}
	public CompanyDto searchByDistrict(String District) {
		for(CompanyDto object:com) {
			if(object.getDistrict().equals(District)) {
				return object;
			}
		}
		return null;
	}
	public CompanyDto searchByzipcode(int zipcode) {
		for(CompanyDto object:com) {
			if(object.getZipcode().equals(zipcode)) {
				return object;
			}
	
	}
		return null;
	}
}


