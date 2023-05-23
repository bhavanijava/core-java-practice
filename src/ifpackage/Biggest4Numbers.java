package ifpackage;

import java.util.Scanner;

public class Biggest4Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		if(a>b&&a>c&&a>d) 
		{
			System.out.print("a is big");
		}
		else if(b>c&&b>d)
		{
			System.out.print("b is big");
		}
		else if(c>d)
		{
			System.out.print("c is big");
		}
		
		else
		{
			System.out.print("d is big");
		}
	}

}
