package labactivity;

import java.util.Scanner;

public class Fabonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of factors in series");
		int n=sc.nextInt();

				int a=0,b=1,c;
				
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}

}
