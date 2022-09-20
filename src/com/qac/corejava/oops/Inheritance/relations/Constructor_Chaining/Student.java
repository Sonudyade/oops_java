package com.qac.corejava.oops.Inheritance.relations.Constructor_Chaining;

public class Student {
	private String name;
	private int age;
	
	
	Student() {
		
	}
	Student(String name, int age){
		System.out.println("Defult constructor");
		System.out.println(name);
		System.out.println(age);
	}

}
