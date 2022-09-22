package com.qac.corejava.oops.Inheritance.relations;

import com.qac.corejava.oops.Inheritance.relations.IS_A.JavaTrainer;

public class TestTrainer {
	
	public static void main (String[] args) {
		JavaTrainer J = new JavaTrainer();
		J.setname("Nikunj Sir");
		J.setage(27);
		J.setsub("CoreJava");
		
		System.out.println(J.getname());
		System.out.println(J.getage());
		System.out.println(J.getsub());
		
}
}