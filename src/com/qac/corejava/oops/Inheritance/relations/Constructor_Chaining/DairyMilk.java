package com.qac.corejava.oops.Inheritance.relations.Constructor_Chaining;

public class DairyMilk extends Chocolate{
	String name;
	
	
	DairyMilk() {
		super("dairymilk", 100);
		System.out.println("Constructor chaining using super statement");
		
	}
	
	public static void main(String[] args) {
		DairyMilk d = new DairyMilk();
	}

}
