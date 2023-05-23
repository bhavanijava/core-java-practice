package whileloop;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter a number");
			int n=sc.nextInt();
			if(n%2==0)
			{
				System.out.println("even");
			}
			else
			{
				System.out.println("odd");
			}
			System.out.println("do you want to check another(y/n): ");
			char ch=sc.next().charAt(0);
			if(ch=='n')
			break;
			
		}
	}

}
