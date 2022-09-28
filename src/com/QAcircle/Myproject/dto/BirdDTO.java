package com.QAcircle.Myproject.dto;

public class BirdDTO {
	private String name;
	private String color;
	
	public BirdDTO() {
		System.out.println("BirdDTO class constructor");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this .name= name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color= color;
	}
}

