package whileloop;

import java.util.Scanner;

public class Adam {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num,temp,r1,r2,sq,rev1=0,rev2=0;
		num=sc.nextInt();
		temp=num*num;
		System.out.println("squre of the number "+temp);
		while(temp!=0)
		{
			r1=temp%10;
			rev1=rev1*10+r1;
			temp=temp/10;
		}
		System.out.println("Reverse the Number"+rev1);
		sq=(int)Math.sqrt(rev1);
		System.out.println("sqrt number is"+sq);
		while(sq!=0)
		{
			r2=sq%10;
			rev2=rev2*10+r2;
			sq=sq/10;
		}
		System.out.println("Reverse the Number "+rev2);
		
		if(rev2==num)
		{
			System.out.println("Adam");
		}
		else
		{
			System.out.println(" Not Adam");

		}
	}

}
