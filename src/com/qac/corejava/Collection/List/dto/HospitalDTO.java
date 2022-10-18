package com.qac.corejava.Collection.List.dto;

public class HospitalDTO {
	
	private String name;
	private String address;
	private String ward;
	
	public HospitalDTO(){
		System.out.println("Invoking HospitalDTO constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getWard() {
		return ward;
	}
	public void setWard(String ward) {
		this.ward=ward;
	}
	@Override
	public String toString() {
		return "[Name: "+name+"\t Addres : "+address+"\t Ward : "+ward+"\t ]";
	
	
	

	}
}


