package com.qac.corejava.objectClass.dto;
import java.util.ArrayList;

 public class TrainDto {
	private String name;
	private String origin;
	private String destination;
	private int speed;
	private int cost;
	  
	public TrainDto() {
		System.out.println("Invoking Train constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed= speed;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost ) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "[Name: "+name+"\t Origin : "+origin+"\t Destination : "+destination+"\t Speed: "+speed+"\t Cost: "+cost+"\t]";
	
	

}
 }
