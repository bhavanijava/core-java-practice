package ifpackage;

import java.util.Scanner;

public class FoursubjecstPassedOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m1 marks");
		int m1=sc.nextInt();
		System.out.println("Enter m2 marks");

		int m2=sc.nextInt();
		System.out.println("Enter m3 marks");

		int m3=sc.nextInt();
		System.out.println("Enter m4 marks");

		int m4=sc.nextInt();
		if(m1>=35&&m2>=35&&m3>=35&&m4>=35)
		{
			System.out.println("pass");

		}
		else
		{
			System.out.println("fail");

		}
		

		
	}

}
