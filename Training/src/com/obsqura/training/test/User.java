package com.obsqura.training.test;

public class User {
public static void main(String args[])
{
	Bank b=new Bank();
	b.setPin(1234);
	int pin=b.getPin();
	System.out.println("Pin is "+pin);
}
}
