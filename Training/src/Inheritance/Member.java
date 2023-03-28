package Inheritance;

public class Member {
String name,address;
int age;
long phoneno;
double salary;
public Member() {
	
}
public Member(String name,String address,int age,long phoneno,double salary)
{
	this.name=name;
	this.address=address;
	this.age=age;
	this.phoneno=phoneno;
	this.salary=salary;
}
public void printSalary()
{
	System.out.println("Salary of the member is Rs."+salary);
}
public void printDetails()
{
	System.out.println("Name is "+name+"\nAddress is "+address+"\nAge is "+age
			+"\nPhone number is "+phoneno+"\nSalary is Rs."+salary);
}
}
