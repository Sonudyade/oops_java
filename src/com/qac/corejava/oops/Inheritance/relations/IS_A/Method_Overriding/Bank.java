package com.qac.corejava.oops.Inheritance.relations.IS_A.Method_Overriding;

public class Bank {
	String name;
	String location;
	
	public void savingMoney(String name) {
		System.out.println("savingmoney in bank");
	}

	public String safety() {
		System.out.println("keep money safe for customer");
		return "money";
	}
	
}
