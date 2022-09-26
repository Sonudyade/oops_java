package com.qac.corejava.oops.Inheritance.TypesOfInheritance.Hybrid;

public class Triangle extends Square{
	public void output() {
		System.out.println("I am a part of sqauar");
	}
	
	public static void main(String[] args) {
		Triangle tri = new Triangle();
		tri.show();
		tri.display();
		tri.print();
		tri.output();
	}

}
