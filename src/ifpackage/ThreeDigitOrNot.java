package ifpackage;

import java.util.Scanner;

public class ThreeDigitOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(num>99&&num<=999)
		{
			System.out.println("Three digit");
		
		}
		else
		{
			System.out.println(" not ");

		}
	}

}
