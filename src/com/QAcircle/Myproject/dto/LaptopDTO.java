package com.QAcircle.Myproject.dto;

public class LaptopDTO {
	
	private String brandName;
	private int cost;

	public  LaptopDTO() {
		System.out.println("Invoking  LaptopDTO constructor");
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName=brandName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost=cost;
	}

}
