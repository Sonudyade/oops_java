package com.qac.corejava.oops.Abstraction.Interface;

public class ProgrammingLang implements Language {

	@Override
	public void getName(String name) {
	   System.out.println("Programming language");
		
	}

	@Override
	public void getType(String type) {
		System.out.println("Developer");
		
	}
	

}
