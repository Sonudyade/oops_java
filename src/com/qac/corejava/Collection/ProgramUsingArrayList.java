package com.qac.corejava.Collection;

import java.util.ArrayList;

public class ProgramUsingArrayList {
	
	public static void main(String []args) {
		ArrayList information = new ArrayList();
		information.add("Sony");
		information.add("Bidar");
		information.add(23);
		information.add(1998);
		information.add(5.1f);
		information.add(973102507);
		information.add(true);
		information.add('W');
		information.add(89.2f);
		information.add("Female");
	
		
		System.out.println(information);
		
		System.out.println(information.get(0));
		System.out.println(information.get(1));
		System.out.println(information.get(2));
		System.out.println(information.get(3));
		System.out.println(information.get(4));
		System.out.println(information.get(5));
		System.out.println(information.get(6));
		System.out.println(information.get(7));
		System.out.println(information.get(8));
		System.out.println(information.get(9));
		
		information.remove(1);
		System.out.println(information);
		
		information.clear();
		System.out.println(information);
		
		System.out.println(information.size());
		
		
		
		
		
	
		
	}

}
