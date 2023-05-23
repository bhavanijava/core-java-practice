package java8features;

import java.util.Scanner;

import jdk8features.CheckNum;

public class LamdaEvenCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		LamdaEven obj=x ->{
			if(x%2==0)
			{
				System.out.println("Even");
			}
			else
			{
				System.out.println(" Not Even");

			}
		};
		obj.check(num);
	}
}
