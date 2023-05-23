package whileloop;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		
		int temp,sum=0,r;
		temp=n;
		while(n!=0)
		{
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
			
		}
		if(temp==sum)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
		}
	

}
