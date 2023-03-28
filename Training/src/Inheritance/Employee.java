package Inheritance;

public class Employee {
	double basic,da,hra;	
	public Employee()
	{
		
	}
	public Employee(double basic,double da,double hra)
	{
		this.basic=basic;
		this.da=da;
		this.hra=hra;
	}
	public void calculateSalary()
	{
		double salary=basic+da+hra;
		System.out.println("Salary is Rs."+salary);
	}
	public void calculateBonus()
	{
		double bonus=basic*0.1;
		System.out.println("Bonus is Rs."+bonus);
	}
}
