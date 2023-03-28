package aggregation;

public class Employee {
	String empName;
	int empId;
	Car car;
	public Employee(String empName, int empId, Car car) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.car = car;
	}
	public void printDetails()
	{
		System.out.println("Employee Details........."+"\nEmployee ID:"+empId
				+"\nEmployee Name:"+empName+"\nCar Name:"+car.carName
				+"\nCar Color:"+car.color+"\nReg.No:"+car.regNo);
	}
	public static void main(String args[])
	{
		Car c=new Car("Red","Swift",2035l);
		Employee e=new Employee("Angitha",123,c);
		e.printDetails();
	}
}

