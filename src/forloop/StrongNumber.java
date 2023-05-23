package forloop;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit");
		int limit=sc.nextInt();
		for(int n=1;n<=limit;n++)
		{
			int x=n;
			int sum=0;
			while(x!=0)
			{
				int d=x%10;
				int fact=1;
				for(int i=1;i<=d;i++)
				{
					fact=fact*i;
				}
				sum=sum+fact;
				x=x/10;
			}
			if(sum==n)
				System.out.println(n+" ");
		}
		
	}

}
