package com.qac.corejava.oops.Inheritance.relations.IS_A;

public class Trainer {
	
	private String name;
    private int age;
    private String sub;
    
    public Trainer () {
    	System.out.println("Invoking Trainer constructor");
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
    public String getsub() {
    	return sub;
    }
    public void setsub(String sub) {
    	this.sub =sub;
    }


}
