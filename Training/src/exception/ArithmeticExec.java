package exception;

public class ArithmeticExec {
public static void main(String args[]) throws ArithmeticException
{
	int age=10;
	if(age<18)
	{
	throw new ArithmeticException("Age not valid");
	}
	else
	{
		System.out.println("Eligible to vote");
	}
}
}
