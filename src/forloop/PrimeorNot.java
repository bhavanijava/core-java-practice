package forloop;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;

		}
		if(count==2)
		{
			System.out.print("prime");
		}
		else
		{
			System.out.print(" notprime");
		}
	}

}
