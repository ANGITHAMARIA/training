package exception;

public class ArithExc {
public static void main(String args[])
{
	try {
		int a=10;
		int b=a/0;
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("You can't divide a number by 0");
	}
}
}
