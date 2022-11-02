package com.qac.corejava.Exception;

public class Trip {
	public static void main(String[] args) {
		
		System.out.println("Started main()");
		String[]place= {"Banglore","Mysure","Manglore","Goa"};
		
		try {
		for(int i=0;i<=place.length;i++) {
			System.out.println(place[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
		
		}
		System.out.println("End of main()");
		
		
	}

}
