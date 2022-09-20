package com.qac.corejava.oops.Inheritance.relations.IS_A;

public class Bird {
	private String name;
    private byte noOfLegs;
    private String color;
    
    public Bird () {
    	System.out.println("Invoking Bird constructor");
    }
    
    public String getname() {
    	return name;
    }
    
    public void setname(String name) {
    	this.name = name;
    }
    
    public byte getnoOfLegs() {
    	return noOfLegs;
    }
    
    public void setnoOfLegs(byte noOfLegs) {
    	this.noOfLegs = noOfLegs;
    }
    
    public String getcolor() {
    	return color;
    }
    
    public void setcolor(String color) {
    	this.color = color;
    	
    }

}
