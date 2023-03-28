package exception;

public class HandleInvalidAgeException{
	public static void main(String args[]) throws InvalidAgeException
	{
int age=15;
if(age<18)
{
	throw new InvalidAgeException("Age is not valid or less than 18");
}
else
{
	System.out.println("Eligible to vote");
}
}
}
