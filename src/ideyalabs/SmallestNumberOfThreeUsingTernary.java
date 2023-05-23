package ideyalabs;

import java.util.*;

public class SmallestNumberOfThreeUsingTernary {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b&&a<c) 
		{
			System.out.print("a is small");
		}
		else if(b<c)
		{
			System.out.print("b is small");
		}
		else
		{
			System.out.print("c is small");
		}
		
	}
	}


