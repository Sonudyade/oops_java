package com.QAcircle.Myproject.dto;

public class MobileDTO {
	private String brandName;
	private int price;
	
	
	public MobileDTO() {
		System.out.println("Invoking MobileDTO constructor");
	
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName= brandName;
	}
	public int getPrice() {
		return price;
		
	}
	public void setPrice(int price) {
		this.price=price;
	}
	


}
