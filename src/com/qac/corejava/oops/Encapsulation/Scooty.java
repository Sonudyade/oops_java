package com.qac.corejava.oops.Encapsulation;

public class Scooty {
	
	private String brandName;
	private int price;
	private String color;
	
	Scooty() {
		System.out.println("Invoking scooty constructor");
		
	}
	
	public String getBrandName() {
		return brandName;
	}
	
	public void setBrandName (String brandName) {
		this.brandName = brandName;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice (int price) {
		this.price = price ;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public void print() {
		System.out.println(brandName +"\t"+ price +"\t"+ color) ;
	}
}
