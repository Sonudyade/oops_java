package com.qac.corejava.Basic_CorePrograms;

import java.util.Scanner;

public class FlipCoin {
	
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		int count= sc.nextInt();
		int head=0;
		int tail=0;
		for(int i=0; i< count;i++) {
			double flip= Math.random();
			if(flip>0.5)
				head++;
			else
				tail++;
		}
		float headPercentage=(head*100)/count;
		float tailPercentage=(tail*100)/count;
		
		System.out.println("Heads percentage "+headPercentage);
		System.out.println("Tails percentage "+tailPercentage);


			
			
			
		}
	}

