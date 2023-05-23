package forloop;

import java.util.Scanner;

public class PerfectNmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				sum=sum+i;
			
		}
		if(n==sum)
		{
			System.out.println("perfect number");
			
		}
		else
		{
			System.out.println("not perfect number");	
		}
	}
	

}
