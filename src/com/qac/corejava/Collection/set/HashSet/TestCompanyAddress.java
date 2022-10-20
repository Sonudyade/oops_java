package com.qac.corejava.Collection.set.HashSet;

import java.util.HashSet;

import com.qac.corejava.Collection.set.HashSet.DAO.CompanyAddressDAO;
import com.qac.corejava.Collection.set.HashSet.DTO.AddressDto;
import com.qac.corejava.Collection.set.HashSet.DTO.CompanyDto;

public class TestCompanyAddress {
	
	private static AddressDto object;

	public static void main(String[] args) {
		CompanyDto dto =new CompanyDto();
		CompanyAddressDAO comAdd = new CompanyAddressDAO();
		
		HashSet set = new HashSet();
		dto.setName("QAcircle");
		dto.setNoOfEmployee(50);
		dto.setTypeOfCompany("Commercial");
		dto.setAddress("Banglore");
		dto.setCountry("India");
		dto.setState("Karnataka");
		dto.setDistrict("Bidar");
		dto.setCity("Aurad");
		dto.setArea("Teachers Colony");
		dto.setZipcode(585326);
		
		comAdd.save(dto);
		System.out.println(comAdd);
		
		CompanyDto show = comAdd.searchByCountry("India");
		System.out.println(show);
		
		CompanyDto print=comAdd.searchByState("Karnataka");
		System.out.println(print);
		
		CompanyDto display =comAdd.searchByDistrict("Bidar");
		System.out.println(display);
		
		CompanyDto response=comAdd.searchBynoOfEmployee(50);
		System.out.println(response);
		
		
		
	
		
		
		
		
		
	}

}
