package com.qac.corejava.oops.Inheritance.relations.IS_A.Method_Overriding;

public class Food {
	
	String name;
	int TypeOfFood;
	
	
	public void OrderFood(String name) {
		System.out.println("Order Food forEating ");
		
	}
	public String goodHealth() {
		System.out.println("Having good food for good health");
		return "good food";
	}

}
