package com.qac.corejava.oops.Abstraction;

public abstract class Bank {
	
	public abstract void  getRateOfIntrest();
	
	public void sentSmsNotification() {
		System.out.println("sms sent to mobile number");
}
	public Bank() {
		System.out.println("calling bank constructor");
	
		
	}
}