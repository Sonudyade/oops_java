package com.QAcircle.Myproject.dto;

public class HPLaptopDTO extends  LaptopDTO{
	
	private String color;
	private String features[];
	
	public HPLaptopDTO (){
		System.out.println("Invoking HPLaptopDTO constructor");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String []getFeatures() {
		return features;
	}
	public void setFeatures(String []features) {
		this.features= features;
	}

}
