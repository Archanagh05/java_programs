package Operator;
import java.util.Scanner;
public class Arithmatic {

	public static void main(String[] args) 
	{
		int a;
		int b;
		System.out.println("Enter value of a:");
		Scanner c=new Scanner(System.in);
		a=c.nextInt();
		
		System.out.println("Enter value of b:");
		b=c.nextInt();

		System.out.println("value of a :"+a);
		System.out.println("value of b :"+b);
		System.out.println("Addition is :"+(a+b));
		System.out.println("Substraction is :"+(a-b));
		System.out.println("Multiplcation is :"+(a*b));
		System.out.println("Division is :"+(a/b));
		System.out.println("reminder is :"+(a%b));

	}

}
