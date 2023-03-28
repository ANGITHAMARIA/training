package interfac;

public class MultipleInheritance implements Inter1,Inter2 {

	public void print()
	{
	System.out.println("Multiple inheritance achieved");	
	}
	public void print1()
	{
		System.out.println("Multiple inheritance can be achieved by interface");
	}
	public static void main(String args[])
	{
		MultipleInheritance m=new MultipleInheritance();
		m.print();
		m.print1();
	}
}
