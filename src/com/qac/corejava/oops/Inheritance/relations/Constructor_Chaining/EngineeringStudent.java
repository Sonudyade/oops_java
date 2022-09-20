package com.qac.corejava.oops.Inheritance.relations.Constructor_Chaining;

public class EngineeringStudent extends Student{
	String name;
	
	
	EngineeringStudent() {
	      super("SONY",23);
	      System.out.println("Constructor chaining using super statement");
	}
	
	
	public static void main(String[] args) {
		EngineeringStudent e = new EngineeringStudent();
	}

}
