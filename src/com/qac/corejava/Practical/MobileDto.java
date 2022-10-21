package com.qac.corejava.Practical;

public class MobileDto {
	
	private String modelName;
	private String beandName;
	private int mobileId;
	private int cost;
	private String memory;
	private int serialNumber;
	private int noOfCamera;
	
	public MobileDto() {
		System.out.println("Invoking MobileDto constructor");
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getBeandName() {
		return beandName;
	}

	public void setBeandName(String beandName) {
		this.beandName = beandName;
	}

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getNoOfCamera() {
		return noOfCamera;
	}

	public void setNoOfCamera(int noOfCamera) {
		this.noOfCamera = noOfCamera;
	}

}
