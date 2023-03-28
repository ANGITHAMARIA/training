package encapsulation;

public class Contractor extends Employee {

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		int noofhours=5;
		double paymentperhour=200;
		double salary=noofhours*paymentperhour;
		System.out.println("Salary is Rs."+salary);
	}
public static void main(String[] args) 
{
	Employee c=new Contractor();
	c.calculateSalary();
}
}
