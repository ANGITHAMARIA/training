package exception;

public class HandleIndexOutOfBound {
	public static void main(String args[])
	{
int a[]= {1,2,3,4,5};
try 
{
	System.out.println("7th element :"+a[7]);
}
catch(IndexOutOfBoundsException e)
{
System.out.println("Array is out of Bound");	
}
	}
}
