package Inheritance;

public class Rectangle {
	int l,b;
public Rectangle(int l,int b)
{
	this.l=l;
	this.b=b;
}
public void calculateArea()
{
	int area=l*b;
	System.out.println("Area: "+area);
}
public void calculatePerimeter()
{
	int perimeter=2*(l+b);
	System.out.println("Perimeter: "+perimeter);
}
}
