package aggregation;

public class Student {
	String name;
	int rollno;
	Address address;
	
public Student(String name, int rollno, Address address) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.address = address;
	}
public static void main(String args[])
{
	Address address1=new Address("city1","state1","Country1");
	Address address2=new Address("city2","state2","country2");
	
	Student s1=new Student("Angitha",1,address1);
	Student s2=new Student("Test",2,address2);
	System.out.println("Details of student 1");
	s1.printDetails();
	System.out.println("Details of student 2");
	s2.printDetails();
	
}
public void printDetails()
{
	System.out.println("Name is "+name+"\nRoll No-"+rollno+"\nAddress:"+
address.city+address.state+address.country);
}
}

