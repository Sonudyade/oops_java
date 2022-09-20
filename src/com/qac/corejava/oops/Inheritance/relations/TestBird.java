package com.qac.corejava.oops.Inheritance.relations;
import com.qac.corejava.oops.Inheritance.relations.IS_A.Parrot;

public class TestBird {
  
	public static void main (String[] args) {
		Parrot p = new Parrot();
		p.setname("Parrot");
		p.setnoOfLegs((byte)4);
		p.setcolor("Green");
		p.setstay("Forest");
		System.out.println(p.getname());
		System.out.println(p.getnoOfLegs());
		System.out.println(p.getcolor());
		System.out.println(p.getstay());
        
	}
}
