package com.qac.corejava.oops.Inheritance.relations.Constructor_Chaining;

public class Employee {
	String name;
	int age;
	String Address;
	int Salary;
	   
	Employee() {
		this("Sony",23,"bidar", 50000);
		
		System.out.println("Constructor chaining");
	}
	
	
	Employee(String name,int age, String Address,int Salary){
		System.out.println("Constructor with parameter");
		System.out.println(name);
		System.out.println(age);
		System.out.println(Address);
		System.out.println(Salary);
		
	}
	public static void main(String[] args) {
		Employee e = new Employee();
	}
	
	
}
	
	
	
	
