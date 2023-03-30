package com.java.basic;

import java.util.Scanner;

public class Question_7_Nested_if
{

	public static void main(String[] args)
	{
		int a;
		System.out.println("ENter your age");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		
		if  (a<18)
		{
			System.out.println("Consider as minor");
		}
		else
		{
			if (a>=18 || a<=50)
			{
				System.out.println("Applicable for marrige");
			}
			else
			{
				System.out.println(" not applicable");
			}
			
		}

	}

}
