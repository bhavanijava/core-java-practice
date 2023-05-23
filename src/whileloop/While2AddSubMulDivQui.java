package whileloop;

import java.util.Scanner;

public class While2AddSubMulDivQui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Division\n5.Quit");
			System.out.println("Enter choice:");
			int ch=sc.nextInt();
			if(ch==1)
			{
				System.out.println("Enter input:");
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println("Result="+(a+b));
				
			}
			else if(ch==2)
			{
				System.out.println("Enter input:");
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println("Result="+(a-b));
				
			}
			else if(ch==3)
			{
				System.out.println("Enter input:");
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println("Result="+(a*b));
				
			}
			else if(ch==4)
			{
				System.out.println("Enter input:");
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println("Result="+(a/b));
				
			}
			else if(ch==5)
			{
				System.out.println("end");
				System.exit(1);
			}
			else {
				System.out.print("invalid choice");
			}

		}

	}

}
