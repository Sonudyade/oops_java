


package com.qac.corejava.oops.Encapsulation;

import com.qac.corejava.oops.Encapsulation.Laptop;

  

public class TestLaptop {
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		laptop.setbrandNameAndModelName("Dell inspiron");
		laptop.setPrice(3500);
		laptop.setOs("Linux");
		laptop.setProcessor("i711gen");
		laptop.setRam((byte)16);
		laptop.print();
	}

}
