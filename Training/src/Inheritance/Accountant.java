package Inheritance;

public class Accountant extends Employee {
	public Accountant(double basic,double da,double hra)
	{
		super();
		this.basic=basic;
		this.da=da;
		this.hra=hra;
	}
public static void main(String args[])
{
	Accountant a=new Accountant(5000,1000,1000);
	a.calculateSalary();
	a.calculateBonus();
}
}
