package com.qac.corejava.Basic_CorePrograms;

public class LeapYear {
	
	public static void main(String[] args) {
		int year=2000;
		boolean leap=true;
		
		if(year %4==0) {
			leap=true;
		}
		else
			leap=false;
		if (leap)
			System.out.println(year+ "is a leap year");
		else
			System.out.println(year+"is not a leap year");
	}

}
