package com.java.basic;

import java.util.Scanner;

public class Question_9_Atm 
{
	public static void main(String[] args)
	{
		int ammount=5000;
		int balance;
		int atm;
		String pass="aaru";
		
		System.out.println("1. Withdraw");
		System.out.println("2. deposite");
		System.out.println("3. check balance");
		System.out.println("4. change passward");
		System.out.println("Choose option");
		Scanner a=new Scanner(System.in);
		atm=a.nextInt();
		switch (atm)
		{
		case 1 :
		System.out.println("enter ammount for withdraw");
		int withdraw =a.nextInt();
			if (ammount>=withdraw)
			{
				ammount=ammount-withdraw;
				System.out.println(" remaining balance :"+ammount);
			}
			else
			{
				System.out.println("insufficient ammount");
			}
			break;
		case 2:
			System.out.println("enter ammount for deposite");
			int deposite=a.nextInt();
			ammount=ammount+deposite;
			System.out.println("total ammount after deposite"+ammount);
			break;
		case 3:
			System.out.println("enter your password to check balance");
			String p=a.next();
			if (p.equals(pass))
			{
				System.out.println("Your balance is "+ammount);
			}
			else
			{
				System.out.println("Invalid Password");
			}
		case 4:
			System.out.println("Enter new password");
			String pa=a.next();
			System.out.println("Enter new password");
			String pas=a.next();
			if (pa.equals(pas))
			{
				System.out.println(" Successfully change your password...! ");
				
			}
			else
			{
				System.out.println(" Something went wrong...! ");
				
			}
			
		}

	}


}
