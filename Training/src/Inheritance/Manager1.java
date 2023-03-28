package Inheritance;

public class Manager1 extends Member {
String department;

public Manager1(String name, String address, int age, long phoneno, double salary) 
{
	super(name, address, age, phoneno, salary);
	// TODO Auto-generated constructor stub
}
public static void main(String args[])
{
	Manager1 m=new Manager1("Test","Address2",30,9874561230l,20000);
	System.out.println("Manager Details........");
	m.printDetails();
}
}
