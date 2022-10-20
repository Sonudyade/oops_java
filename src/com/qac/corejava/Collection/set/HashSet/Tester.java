package com.qac.corejava.Collection.set.HashSet;

import java.util.HashSet;

public class Tester {
	
	public static void main(String[] args) {
		
		BankAccountDtailsDTO dto = new BankAccountDtailsDTO();
		BankAccountDtailsDAO dao = new BankAccountDtailsDAO();
		
		HashSet set = new HashSet();
		dto.setName("Sony");
		dto.setAccountNumber(567834579);
		dto.setEmailID("Sony123@gmail.com");
		dto.setMoNo(998456789);
		dto.setiFSC("CNRB000333");
		dto.setDOB("04-Jun-99");
		dto.setAddress("Teachers colony Aurad");
		dto.setOccupation("Employee");
		
		dao.save(dto);
		
		BankAccountDtailsDTO show = dao.SearchByName("Sony");
		System.out.println(show);
		
		BankAccountDtailsDTO display =dao.SearchByIFCS("CNRB000333");
		System.out.println(display);
		
		BankAccountDtailsDTO print = dao.SearchByAccountNumber(567834579);
		System.out.println(print);
		
		BankAccountDtailsDTO response=dao.removeByAccountNumber(567834579);
		System.out.println(response);
		
		BankAccountDtailsDTO use =dao.updateMoNoByAccountNumber(998456789,567834579);
		System.out.println(use);
		
		BankAccountDtailsDTO shows=dao.updateMoNoByName(567834579 ,"Sony");
		System.out.println(shows);
		
		}

		
	}


