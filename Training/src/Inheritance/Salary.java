package Inheritance;

public class Salary extends Hra {

public static void main(String args[])
{
	
	Salary s=new Salary();
	s.findSalary();
}
public void findSalary()
{
double basicpay=super.getBasicPay();
double deduction=super.getDeduction();
double bonus=super.getBonus();
double hra=super.findHra(basicpay);
double pf=super.findPf(basicpay);
double salary=basicpay+hra-pf-deduction+bonus;
System.out.println("PAYSLIP\nBasic Pay:Rs."+basicpay+"\nDeduction:Rs"+deduction+
		"\nHRA:Rs"+hra+"\nPF:Rs."+pf+"\nBonus:Rs"+bonus+"\nTotal Salary:Rs"+salary);
}
}