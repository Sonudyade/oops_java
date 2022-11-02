package com.qac.corejava.Collection.ProjectGroceryShop.DTO;

public class AddressDTO {
	
	private String BuildingNo;
	private String Area;
	private String City;
	private String State;
	private String Country;
	private int Zipcode;
	
	public String getBuildingNo() {
		return BuildingNo;
	}

	public void setBuildingNo(String buildingNo) {
		BuildingNo = buildingNo;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public int getZipcode() {
		return Zipcode;
	}

	public void setZipcode(int zipcode) {
		Zipcode = zipcode;
	}

	public AddressDTO() {
		System.out.println("Invoking AddressDTO constructor");
	}

}
