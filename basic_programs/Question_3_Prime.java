package com.java.basic;

import java.util.Scanner;

public class Question_3_Prime
{

	public static void main(String[] args)
	{
		System.out.println("Enter any no:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int i=2;
		boolean f=false;
		
		while (i<=n/2)
		{
			if (n%2==0)
			{
				f=true;
				break;
			}
			i++;
		}
		
		if (!f)
		{
			System.out.println("no is prime number");
		}
		else
		{
			System.out.println("no is Not prime number");
		}
		
		
		
	}

}
