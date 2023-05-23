package oopsbydurga;

import java.util.Scanner;

public class Methods {

	public static void main(String[] args)
	{
		// no inputs and no outputs invoking
		Methods.m1();
		Methods obj=new Methods();
		obj.m2();
		
		// with input and no output
		Methods.m1(10, 20);
		obj.m2(30,40);
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		obj.isEven(n);
		
		//with input and with output
		int x=Methods.add(1, 2);
		System.out.println(x);
		
		String res=Methods.evenOrOdd(8);
		System.out.println(res);

	}
	
	// no inputs and no outputs
	static void m1()
	{
		System.out.println("m1");
	}
	void m2()
	{
		System.out.println("m2");
	}
	
	// with input and no output
	static void m1(int a,int b)
	{
		int c=a+b;
		System.out.println("adding two numbers "+c);
	}
	
	 void m2(int a,int b)
	{
		int c=a+b;
		System.out.println("adding two numbers "+c);
	}
	 
	void isEven(int n)
	{
		if(n%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
	
	
	//with input and with output
	static int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	static String evenOrOdd(int n)
	{
		if(n%2==0)
			return "even";
		else 
			return "odd";
	
	}
	
	
	

}
