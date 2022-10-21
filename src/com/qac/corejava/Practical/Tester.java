package com.qac.corejava.Practical;

import java.util.HashSet;

import com.qac.corejava.Collection.set.HashSet.BankAccountDtailsDTO;

public class Tester {
	public static void main(String[] args) {
		
		MobileDto dto = new MobileDto();
		MobileDao dao = new MobileDao();
		
		HashSet set = new HashSet();
		dto.setBeandName("Vivo");
		dto.setModelName("Vivo1603");
		dto.setCost(20000);
		dto.setMemory("64GB");
		dto.setMobileId(2);
		dto.setNoOfCamera(2);
		dto.setSerialNumber(1);
		
		dao.save(dto);
		
		MobileDto show = dao.deleteByMobileId(2);
		System.out.println(show);
		
		MobileDto display= dao.getAllByBrandName("Vivo");
		System.out.println(display);
		
		MobileDto print = dao.updateBySerialNumber(1);
		System.out.println(print);
		
		MobileDto.response = dao.getAll();
		System.out.println(response);
		
		
	}
	


