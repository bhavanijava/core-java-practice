package ifpackage;

import java.util.Scanner;

public class EligibleVote {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  age");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("eligible");

		}
		else
		{
			System.out.println("not");

		}

	}

}
