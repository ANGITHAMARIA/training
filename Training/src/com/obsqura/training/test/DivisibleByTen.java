package com.obsqura.training.test;

public class DivisibleByTen extends Addition 
{
public static void main(String args[])
{
	DivisibleByTen d=new DivisibleByTen();
	d.findDivisibleByTen();
}
public void findDivisibleByTen()
{
int sum = super.findSum(10,15);
int rem=sum%10;
if(rem==0)
{
	System.out.println("Divisible by 10");
}
else
{
	System.out.println("Not divisible by 10");
}
}
}