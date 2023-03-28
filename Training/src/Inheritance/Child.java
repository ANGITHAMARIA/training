package Inheritance;

public class Child extends Parent{
	public static void main(String args[])
	{
		Child c=new Child();
		c.printChild();
		c.printParent();
	}
public void printChild()
{
	System.out.println("This is child class");
}
}
