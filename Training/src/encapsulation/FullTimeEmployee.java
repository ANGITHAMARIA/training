package encapsulation;

public class FullTimeEmployee extends Employee {

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		double paymentperhour=200;
		double salary=8*paymentperhour;
		System.out.println("Salary is Rs."+salary);
	}
public static void main(String args[])
{
	Employee f=new FullTimeEmployee();
	f.calculateSalary();
}
}
