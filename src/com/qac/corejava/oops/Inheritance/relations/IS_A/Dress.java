package com.qac.corejava.oops.Inheritance.relations.IS_A;

public class Dress {
	
	private String name;
    private int age;
    private int cost;
   
    
    public Dress() {
    	System.out.println("Invoking Dress constructor");
    }
    
    public String getname() {
    	return name;
    }
    
    public void setname(String name) {
    	this.name = name;
    }
    
     public int getage() {
    	return age;
    }
    
    public void setage(int age) {
    	this.age = age;
    	
    }
    public int getcost() {
    	return cost;
    }
    public void setcost(int cost) {
    	this.cost = cost;
    }
   
   


}
