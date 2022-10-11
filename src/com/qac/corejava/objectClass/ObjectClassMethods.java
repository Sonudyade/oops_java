package com.qac.corejava.objectClass;

public class ObjectClassMethods {
	
	private String name ="Sony";
	private String  msg = "Hi good morning";
	
	public static void main(String [] args) {
		 ObjectClassMethods methods = new  ObjectClassMethods();
		 ObjectClassMethods methods1 = new  ObjectClassMethods();
		 
		 
		 
		 Class classObj = methods.getClass();
		 
		 System.out.println(methods.getClass().getName());
		 
		 System.out.println(classObj.getSimpleName());
		 
		 System.out.println(methods.hashCode());
		 System.out.println(methods.hashCode());
		 
		 
		 
		 System.out.println(methods.toString());
		 System.out.println(methods.equals(methods));
		 
		 
		 System.out.println(methods);
	}
	
	@Override
	public String toString() {
		return"Name"+name+msg;
	}
	
	
		 
		 
		
		 
		
		 
		 
		
	
	
	


}
