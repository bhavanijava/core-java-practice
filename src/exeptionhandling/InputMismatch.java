package exeptionhandling;

import java.util.InputMismatchException;

import java.util.Scanner;

public class InputMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int z=a+b;
		System.out.println("result:"+z);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Exception: invalid input given");
		}
	}

}
