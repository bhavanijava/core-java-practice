package exeptionhandling;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int z=a/b;
		System.out.println("result:"+z);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception: Denominator sholdnot be zero");
		}
	}

}
