package Inheritance;

public class Square1 extends Rectangle1 {
public void printSquare()
{
	System.out.println("Square is a rectangle");
}
public static void main(String args[])
{
	Square1 s=new Square1();
	s.printShape();
	s.printRectangle();
}
}
