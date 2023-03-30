package com.java.basic;

import java.util.Scanner;

public class Question_8_Conditional_stmt 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Enter Your Name:");
		Scanner sc=new Scanner (System.in);
		String name=sc.next();
		
		System.out.println("Enter Your marks:");
		int a=sc.nextInt();
		
		System.out.println(name);
		if (a>=90 && a<=100)
		{
			System.out.println("A-Grade");
		}
		else if (a>=80 || a<=89)
		{
			System.out.println("B-Grade");
		}
		else if (a>=70 && a<=79)
		{
			System.out.println("C-Grade");
		}
		else if (a>=60 && a<=69)
		{
			System.out.println("D-Grade");
		}

	}

}
