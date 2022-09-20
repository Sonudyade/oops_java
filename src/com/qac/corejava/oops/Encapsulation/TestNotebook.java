package com.qac.corejava.oops.Encapsulation;

public class TestNotebook {
	public static void main(String[] args) {
		Notebook notebook = new Notebook();
		notebook.setName("Ajay");
		notebook.setPrice(40);
		notebook.setTypeOfNotebook("Roll");
		notebook.setcolor("White");
	
		notebook.print();
	}

}
