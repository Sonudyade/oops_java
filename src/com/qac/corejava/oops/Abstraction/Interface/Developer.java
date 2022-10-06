package com.qac.corejava.oops.Abstraction.Interface;

public class Developer implements  EmployeeRequirement  {
	
	
	public void work() {
		System.out.println("Develop application");
		
	}
	public void Location() {
		System.out.println( "bangalore");

	}
	public boolean screening(int score) {
		System.out.println("Attend screening test");
				
		return false;
	}
	public boolean interview(boolean selected) {
		System.out.println("Attend interview");
		if(selected)
         return true;
		return false;
	}

	public void learn() {
		System.out.println("java");
		
	}

	
		
	}
