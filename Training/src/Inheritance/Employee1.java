package Inheritance;

public class Employee1 extends Member {
String specilization;

public Employee1(String name, String address, int age, long phoneno, double salary) {
	super(name, address, age, phoneno, salary);
	// TODO Auto-generated constructor stub
}
public static void main(String args[])
{
	Employee1 e=new Employee1("Angitha","Address1",29,1234567890l,10000);
	System.out.println("Employee Details........");
			e.printDetails();
}
	
}
