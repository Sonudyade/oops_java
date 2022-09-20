package com.qac.corejava.oops.Inheritance.relations.Constructor_Chaining;

public class Chocolate {
	String name;
	int price;
	
	Chocolate() {
		
	}
	
	Chocolate(String name, int price) {
		System.out.println("default constructor");
		System.out.println(name);
		System.out.println(price);
		
	}

}
