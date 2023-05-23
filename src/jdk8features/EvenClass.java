package jdk8features;

import java.util.Scanner;

public class EvenClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		CheckNum a =e ->{
			if(e%2==0)
			{
				System.out.println("Even");
			}
			else
			{
				System.out.println(" Not Even");

			}
		};
		a.check(num);
		
	}

}
