package com.java.basic;

public class Question_13_Default_user
{
	
		int a;
		float b;
		char c;
		boolean d;
		String e;
		
		Question_13_Default_user()
		{
			a=10;
			b=10.3f;
			c='a';
			d=true;
			e="abc";
			
		}
		void m1()
		{
			System.out.println("a="+a);
			System.out.println("b="+b);
			System.out.println("c="+c);
			System.out.println("d="+d);
			System.out.println("e="+e);
			
		}
		public static void main(String[] args) 
		{
			
			Question_13_Default_user g=new Question_13_Default_user();
			g.m1();
					
		

	}

}
