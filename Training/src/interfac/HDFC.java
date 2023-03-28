package interfac;

public class HDFC implements RBI {

	@Override
	public void recurringDeposit(double amount, float duration,float intrate) 
	{
		// TODO Auto-generated method stub
double interest=amount*duration*intrate;
System.out.println("Interest for Rs."+amount+" for "+duration+" years is Rs."+interest);
	}
public static void main(String args[])
{
	double amount=10000;
	float duration=2;
	HDFC h=new HDFC();
	h.recurringDeposit(amount,duration,intrate);
}

}
