package jdk8features;

import java.util.Scanner;

public class Mai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		CheckNum a =e ->{
			if(e>=0)
			{
				System.out.println("positive");
			}
			else
			{
				System.out.println(" Not positive");

			}
		};
		a.check(n);
		
	}

}
