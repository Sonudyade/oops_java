package com.QAcircle.Myproject.dto;

public class WatchDTO {
	private String brandName;
	private String color;
	private int price;
	
	public WatchDTO() {
		System.out.println("Invoking WatchDTO constructor");
	}
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName= brandName;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
		

}
