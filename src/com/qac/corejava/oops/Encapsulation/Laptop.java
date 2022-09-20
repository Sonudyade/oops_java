package com.qac.corejava.oops.Encapsulation;

public class Laptop {
	
	  private String brandNameAndModelName;
	  private int price; 
	  private byte ram;
	  private String os;
	  private String processor;
	  
	  Laptop(){
		  System.out.println("Invoking laptop constructor");
	  }
	 
      public String  getbBrandNameAndModelName() {
    	  return brandNameAndModelName;
      }
      
      public void setbrandNameAndModelName(String brandNameAndModelName) {
    	  this.brandNameAndModelName =  brandNameAndModelName;
      }
      public int getPrice() {
    	  return price;
      }
      public void setPrice(int price) {
    	  this.price = price;
      }
      public byte getRam(){
    	  return ram;
      }
    	  
     public void setRam (byte ram){
    	 this.ram = ram;
     }
     public String getOs() {
    	 return os;
     }
     public void setOs(String os) {
    	 this.os = os;
     }
     public String getProcessor() {
    	 return processor;
     }
     
     public void setProcessor(String processor) {
    	 this.processor = processor;
    	 
     }
     public void print() {
    	 System.out.println( brandNameAndModelName + "\t" + os+ "\t" + price + "\t" + processor + "\t" + ram );
     }
}
  
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     

