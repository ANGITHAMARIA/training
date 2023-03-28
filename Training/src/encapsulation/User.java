package encapsulation;

public class User {
	public static void main(String args[])
	{
	Bank b=new Bank();
	b.setPin(1112);
	b.verifyPin();
}
}