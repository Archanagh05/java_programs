package com.java.basic;

import java.util.Scanner;

public class Question_10_Calculator {

	public static void main(String[] args) 
	{
		int p,q;
		
		Scanner a=new Scanner(System.in);
		p=a.nextInt();
		q=a.nextInt();
		
		System.out.println("Value of p="+p);
		System.out.println("Value of q="+q);
		
		System.out.println("What you want to perform");
		
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Division");
		System.out.println("4. Multiplication");
		System.out.println("5. Reminder");
		
		
		int cal=a.nextInt();
		switch (cal)
		{
		case 1 :
			int add=p+q;
			System.out.println("Addition :"+add);
			break;
			
		case 2:
			int sub=p-q;
			System.out.println("Substraction :"+sub);
			break;
			
		case 3:
			int Div=p/q;
			System.out.println("Division :"+Div);
			break;
		case 4:
			int Mul=p*q;
			System.out.println("Multiplication :"+Mul);
			break;
		case 5:
			int Rem=p%q;
			System.out.println("Reminder :"+Rem);
			
			
		}


	}

}
