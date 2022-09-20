package com.qac.corejava.oops.Encapsulation;

import com.qac.corejava.oops.Encapsulation.Scooty;

public class TestScooty {
	public static void main(String[]args) {
		Scooty scooty = new Scooty() ;
		scooty.setBrandName("Suzuki Access");
		scooty.setPrice(80000);
		scooty.setColor("Glossy Grey");
		scooty.print() ;
	}

}
