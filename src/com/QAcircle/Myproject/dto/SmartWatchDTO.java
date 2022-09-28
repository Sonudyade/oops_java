package com.QAcircle.Myproject.dto;


public class SmartWatchDTO extends WatchDTO {
	private String display;
	private String features[];
	
	public SmartWatchDTO() {
		System.out.println("Invoking WatchDTO constructor");
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display=display;
	}
	public String []getFeatures() {
		return features;
	}
	public void setFeatures(String []features) {
		this.features=features;
	}

}
