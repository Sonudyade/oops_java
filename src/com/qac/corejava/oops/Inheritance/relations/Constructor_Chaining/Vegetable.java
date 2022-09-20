package com.qac.corejava.oops.Inheritance.relations.Constructor_Chaining;

public class Vegetable {
		String name;
		int price;

		
		public Vegetable() {
			this("Tomoto");
		
			System.out.println("Invoking Default constructor");
		}
		
		public Vegetable(String namr) {
			this(100);
			System.out.println("Invoking String constructor");
		}
		public Vegetable(int price) {
			System.out.println("Invoking int constructor");
			
		}
			
		public static void main(String[] args){
			Vegetable v = new Vegetable();
		

		
			
			
		}
	}



