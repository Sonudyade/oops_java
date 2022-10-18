package com.qac.corejava.Basic_CorePrograms;

public class FlipCoin {
	
	public static void main(String[] args) {
		int heads=0;
		int tails=1;
		double randNumber=0.0;
		
		if(randNumber<.5)
		{
			heads++;
			System.out.println("\t heads");
		}
		else
		{
			tails++;
			System.out.println("\t tails");
		}
	}

}
