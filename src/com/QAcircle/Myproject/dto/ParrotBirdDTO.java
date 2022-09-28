package com.QAcircle.Myproject.dto;

public class ParrotBirdDTO extends BirdDTO{
	private String Stay;
    private String color;
    
    ParrotBirdDTO() {
    	System.out.println("Invoking parrotBird constructor");
    }
    public String getStay() {
    	return Stay;
    }
    public void setStay(String Stay) {
    	this.Stay= Stay;
    }
    public String getColor() {
    	return color;
    }
    public void setColor(String color) {
    	this.color= color;
    }
    
	


}
