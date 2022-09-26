package com.qac.corejava.oops.Inheritance.TypesOfInheritance.Multi_level;

public class MahindraXUV400 extends Mahindra {
	
	public void speed() {
		System.out.println("80kmp");
		
	}
	public static void main(String[] args) {
		MahindraXUV400 mahi = new MahindraXUV400();
		mahi.vehicalType();
		mahi.brand();
		mahi.speed();
		
	}

}
