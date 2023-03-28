package Inheritance;

public class Onseason extends Offseason{
	
	public static void main(String args[])
	{
		double totalprice=10000;
		Onseason o=new Onseason();
		o.discount(totalprice);
	}
public void discount(double totalprice)
{
	System.out.println("Discount for Offseason is....");
	super.discount(totalprice);
	System.out.println("Discount for Onseason is......");
	double discount=totalprice*0.4;
	double finalprice=totalprice-discount;
	System.out.println("Eligible for 40% discount and the discounted price is Rs."+finalprice);
}
}
