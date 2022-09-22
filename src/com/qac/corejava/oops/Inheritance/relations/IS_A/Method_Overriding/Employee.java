package com.qac.corejava.oops.Inheritance.relations.IS_A.Method_Overriding;

public class Employee {
	
	String name;
	int age;
	int salary;
	String address;
	
	public void DoingJob(String name) {
		System.out.println("Doing job in Company");
		
	}
	
	public String NewProject() {
		System.out.println("creating new project on new topic");
		return "Project";
	}
	

}
