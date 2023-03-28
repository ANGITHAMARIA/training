package aggregation;

public class Employee1 {
	String empName;
	int empId;
	Car car;
	Bike bike;
	public Employee1(String empName, int empId, Car car, Bike bike) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.car = car;
		this.bike = bike;
	}
	public void printDetails()
	{
		System.out.println("Employee Details........."+"\nEmployee ID:"+empId
				+"\nEmployee Name:"+empName+"\nCar Name:"+car.carName
				+"\nCar Color:"+car.color+"\nCar Reg.No:"+car.regNo
				+"\nBike Name:"+bike.bikeName+"\nBike Reg No:"+bike.regNo);
	}
	public static void main(String args[])
	{
		Bike b=new Bike("Access125",456);
		Car c=new Car("White","Alto",123);
		Employee1 e=new Employee1("Angitha",25,c,b);
		e.printDetails();
	}
}
