package Inheritance;

public class Offseason {
public void discount(double totalprice)
{
	double discount=totalprice*0.15;
	double finalprice=totalprice-discount;
	System.out.println("Eligible for 15% discount and the discounted price is Rs."+finalprice);
}
}