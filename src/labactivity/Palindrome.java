package labactivity;

import java.util.Scanner;



public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int m=n;
		int rev=0;
		while(n!=0)
		{
			int temp=n%10;
			rev=rev*10+temp;
			n=n/10;
		}
		if(m==rev)
		{
			System.out.print("palindrome");
		}
		else
		{
			System.out.print(" not palindrome");
		}
		
	}

}
