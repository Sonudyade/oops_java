package com.qac.corejava.oops.Encapsulation;

public class Notebook {
	  private String Name;
	  private int price; 
	  private String TypeOfNotebook;
	  private String color;
	  
	  Notebook (){
		  System.out.println("Invoking Notebook  constructor");
	  }
	 
    public String  getName() {
  	  return Name;
    }
    
    public void setName(String Name) {
  	  this.Name = Name;
    }
    public int getPrice() {
  	  return price;
    }
    public void setPrice(int price) {
  	  this.price = price;
    }
    
   public String getTypeOfNotebook() {
  	 return TypeOfNotebook;
   }
   public void setTypeOfNotebook(String TypeOfNotebook) {
  	 this.TypeOfNotebook = TypeOfNotebook;
   }
   public String getcolor() {
  	 return color;
   }
   
   public void setcolor(String color) {
  	 this.color= color;
  	 
   }
   public void print() {
  	 System.out.println( Name + "\t"+ price + "\t" + TypeOfNotebook + "\t" + color );
   }


}
