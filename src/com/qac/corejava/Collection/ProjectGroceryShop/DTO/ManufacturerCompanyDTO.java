package com.qac.corejava.Collection.ProjectGroceryShop.DTO;

public class ManufacturerCompanyDTO {
	
	String CompanyName;
    AddressDTO add;
	long ContactNo;
	String MailId;
	
	public ManufacturerCompanyDTO() {
		System.out.println("Invoking ManufacturerCompanyDTO constructor");
		
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public AddressDTO getAdd() {
		return add;
	}

	public void setAdd(AddressDTO add) {
		this.add = add;
	}

	public long getContactNo() {
		return ContactNo;
	}

	public void setContactNo(long contactNo) {
		ContactNo = contactNo;
	}

	public String getMailId() {
		return MailId;
	}

	public void setMailId(String mailId) {
		MailId = mailId;
	}
	
	

}
