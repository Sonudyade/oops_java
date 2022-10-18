package com.qac.corejava.Collection.set.HashSet;
import java.util.HashSet;


public class BankAccountDtailsDTO {
	
	private String name;
	private long accountNumber;
	private long moNo;
	private String iFSC;
	private String emailID;
	private String DOB;
	private String address;
	private String occupation;
	
	
    public BankAccountDtailsDTO() {
    	System.out.println("Invoking BankAccountDtailsDTO constructor");
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getMoNo() {
		return moNo;
	}

	public void setMoNo(long moNo) {
		this.moNo = moNo;
	}

	public String getiFSC() {
		return iFSC;
	}

	public void setiFSC(String iFSC) {
		this.iFSC = iFSC;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String DOB) {
		this.DOB=DOB;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation=occupation;
	}
    

}
