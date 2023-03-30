package com.java.basic;

public class Question_6_Diamond
{

	public static void main(String[] args)
	{
		int n=5;
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=n-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	

	}

}
