package com.qac.corejava.Basic_CorePrograms;

public class Harmonic {
	public static void main(String[] args) {
		
		int count =10;
		double sum=0;
		for(int i =1; i<=10; i++) {
			
			double value = 1.0/i;
			System.out.println(value);
			sum=sum+value;
		}
		System.out.println(sum);
	}


}
