package Inheritance;

public class Hra extends BasicPay {	
public double findHra(double basicpay)
{
	double hra=basicpay*0.05;
	return hra;
}
public double findPf(double basicpay)
{
	double pf=basicpay*0.2;
	return pf;
}
}
