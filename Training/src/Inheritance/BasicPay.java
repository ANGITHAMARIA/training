package Inheritance;
import java.util.Scanner;
public class BasicPay {
Scanner sc=new Scanner(System.in);
public double getBasicPay()
{
System.out.println("Enter basic pay");	
double basicpay=sc.nextDouble();
return basicpay;
}
public double getDeduction()
{
System.out.println("Enter Deduction amount");
double deduction=sc.nextDouble();
return deduction;
}
public double getBonus()
{
System.out.println("Enter Bonus amount");
double bonus=sc.nextDouble();
return bonus;
}
}
