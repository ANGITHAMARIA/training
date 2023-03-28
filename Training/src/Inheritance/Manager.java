package Inheritance;

public class Manager extends Employee {
	
	public Manager(double basic,double da,double hra)
	{
		super();
		this.basic=basic;
		this.da=da;
		this.hra=hra;
	}
public static void main(String args[])
{
Manager m=new Manager(10000,2000,1000);
m.calculateSalary();
m.calculateBonus();
}
}
