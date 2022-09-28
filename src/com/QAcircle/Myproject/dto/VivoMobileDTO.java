package com.QAcircle.Myproject.dto;

public class VivoMobileDTO extends MobileDTO{
	private String color;
	private String features[];
	
	public VivoMobileDTO() {
		System.out.println("Invoking  MobileDTO constructor");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color= color;
	}
	public String[] getFeatures() {
		return features;
	}
	public void setFeatures(String[] features) {
		this.features=features;
	}
	

}
