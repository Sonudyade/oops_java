package com.qac.corejava.oops.Inheritance.relations.HasA;

public class Engine {
	private String brandName;
	private byte noOfStrokes;
	private short capacity;

	public Engine() {
		System.out.println("Invoking Engine constructor");
	}
	
	public String getBrandName() {
		return brandName;
	}
	
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public byte getNoOfStrokes() {
		return noOfStrokes;
	}
	
	public void setNoOfStrokes(byte noOFStrokes) {
		this.noOfStrokes = noOFStrokes;
	}
	
	public short getCapacity() {
		return capacity;
	}
	
	public void setCapacity(short capacity) {
		this.capacity = capacity;
	}
}



