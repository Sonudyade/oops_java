package com.qac.corejava.oops.Abstraction.Upcasting.dao;

public class StudentDao implements EnglishTeacherDao, MathsTeacherDao{

	@Override
	public void isTeacher() {
		System.out.println("Maths teacher ");
		
	}

	@Override
	public void isTeaching() {
		System.out.println("maths teacher teaching maths");
		
		
	}

	@Override
	public void isEnglishTeacher() {
		System.out.println("sudha medam is our english teacher");
		
	}
	

}
