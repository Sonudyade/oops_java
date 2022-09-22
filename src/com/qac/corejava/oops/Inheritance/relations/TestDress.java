package com.qac.corejava.oops.Inheritance.relations;

import com.qac.corejava.oops.Inheritance.relations.IS_A.ModernDress;

public class TestDress {
	
	
	public static void main (String[] args) {
		ModernDress M = new ModernDress();
		M.setname("ModernDress");
		M.setage(24);
		M.setcost(2000);
		
		System.out.println(M.getname());
		System.out.println(M.getage());
		System.out.println(M.getcost());
		
}

}
