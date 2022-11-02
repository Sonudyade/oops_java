package com.qac.corejava.Collection.set.HashSet;

import java.util.HashSet;
import java.util.LinkedList;

import com.qac.corejava.Collection.List.dto.HospitalDTO;

public class BankAccountDtailsDAO {
	
	HashSet<BankAccountDtailsDTO> set = new HashSet<BankAccountDtailsDTO>();
	public String save(BankAccountDtailsDTO dto) {
		set.add(dto);
		return dto.getName()+"data saved";
	}
	
	public BankAccountDtailsDTO SearchByName(String name) {
		
		for( BankAccountDtailsDTO object:set){
			if (object.getName().equals(name)) {
				return object;
			}
		}
		return null;
	}
	public BankAccountDtailsDTO SearchByAccountNumber(long AccountNumber) {
		
		for(BankAccountDtailsDTO object: set) {
			if (object.getAccountNumber()==(AccountNumber)) {
				return object;
			}
		}
		return null;
	}
	public BankAccountDtailsDTO SearchByIFCS(String iFSC) {
		for(BankAccountDtailsDTO object:set) {
			if (object.getiFSC().equals(iFSC)) {
				return object;
			}
		}
		return null
				
				;
	}
	public BankAccountDtailsDTO removeByAccountNumber(long AccountNumber) {
		for(BankAccountDtailsDTO object: set) {
			if (object.getAccountNumber()==(AccountNumber)) {
				return object;
	
			}
		}
		return null;
	}
	public BankAccountDtailsDTO updateMoNoByAccountNumber(long moNo, long AccountNumber ) {
		for(BankAccountDtailsDTO object: set) {
			if (object.getAccountNumber()==(AccountNumber)) {
				object.setMoNo(moNo);
				return object;
			}
		}
		return null;
	}
	public BankAccountDtailsDTO updateMoNoByName(long moNo,String name) {
		for(BankAccountDtailsDTO object: set) {
			if (object.getName().equals(name)) {
				object.setName(name);
				return object;
			}
		}
		return null;
	}
	public void printin(BankAccountDtailsDTO Object) {
		for(BankAccountDtailsDTO object: set) {
		System.out.println(object.getName());
		System.out.println(object.getAccountNumber());
		System.out.println(object.getMoNo());
		System.out.println(object.getiFSC());
		System.out.println(object.getEmailID());
		System.out.println(object.getDOB());
		System.out.println(object.getAddress());
		System.out.println(object.getOccupation());


	
	
	
	

	

	


}
	}
}
