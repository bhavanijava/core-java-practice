package conditional;

import java.util.Scanner;

public class Marks {
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks:");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		if(m1>=35&&m2>=35&&m3>=35)
		{
			int avg=m1+m2+m3/3;
					if(avg>=60)
					{
						System.out.println("A grade");
					
					}
					else if(avg>=50)
					{
					System.out.println("B grade");	
					}
					else
					{
						System.out.println("C grade");
					}
					
		}
		else
		{
			System.out.println("Fail");
		}
	}
}