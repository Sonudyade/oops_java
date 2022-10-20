package com.qac.corejava.Collection.set.HashSet.DTO;

public class CompanyDto extends AddressDto {
	
	private String name;
	private String typeOfCompany;
	private int noOfEmployee;
	private String address;
	
	public CompanyDto() {
		System.out.println("Invoking CompanyDto constructor");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeOfCompany() {
		return typeOfCompany;
	}

	public void setTypeOfCompany(String typeOfCompany) {
		this.typeOfCompany = typeOfCompany;
	}

	public int getNoOfEmployee() {
		return noOfEmployee;
	}

	public void setNoOfEmployee(int noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
