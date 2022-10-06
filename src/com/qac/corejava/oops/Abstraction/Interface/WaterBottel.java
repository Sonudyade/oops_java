package com.qac.corejava.oops.Abstraction.Interface;

public class WaterBottel implements Bottel{
	public static void main(String[] args) {
		System.out.println(color);
		System.out.println(features);
		
		WaterBottel w = new WaterBottel();
		w.fillup();

}

	@Override
	public void fillup() {
		System.out.println("It is filled");
	}
			}
