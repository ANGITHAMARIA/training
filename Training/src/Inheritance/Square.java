package Inheritance;

public class Square extends Rectangle{

	public Square(int s) {
		super(s, s);
		
	}
public 	static void main(String args[])
{
	System.out.println("Area and perimeter of Square is .........");
	Square s=new Square(5);
	s.calculateArea();
	s.calculatePerimeter();
	System.out.println("Area and perimeter of Rectangle is .........");
	Rectangle r=new Rectangle(5,10);
	r.calculateArea();
	r.calculatePerimeter();
}

}
