package abstraction;

public class Rectangle extends Shape {

	@Override
	void display() {
		System.out.println("This is rectangle");		
	}
	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle();
		r.display();
	}

}
