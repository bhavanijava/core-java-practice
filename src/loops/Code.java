package loops;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Code
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
			while(true)
			{
				try 
				{
					System.out.println("1.Add \n2.Subtract \n3.Multiply \n4.Division \n5.Quit");
					System.out.print("Enter Choice:");
					int ch=sc.nextInt();
					if(ch==1)
					{
						System.out.println("Enter input:");
						int a=sc.nextInt();
						int b=sc.nextInt();						
						System.out.println("Result:"+(a+b));
						
					 }
				
				
					
					else if(ch==2)
					{
						System.out.println("Enter input:");
						int a=sc.nextInt();
						int b=sc.nextInt();
						System.out.println("Result:"+(a-b));
						
					}
					else if(ch==3)
					{
						System.out.println("Enter input:");
						int a=sc.nextInt();
						int b=sc.nextInt();
						System.out.println("Result:"+(a*b));
					
					}
					else if(ch==4)
					{
						System.out.println("Enter input:");
						int a=sc.nextInt();
						int b=sc.nextInt();
						System.out.println("Result:"+(a/b));
						
					}
					else if(ch==5)
					{
						System.out.println("end");
						System.exit(1);
						
					}
					else
					{
						System.out.println("invalid choice");
					}
				}
				
				
				
				
			
			catch(InputMismatchException e1)
			{
				System.out.println("Exception:Input must be integer only");
				System.exit(0);
			}
			catch(ArithmeticException e2)
			{
				System.out.println("Exception: Denomination sholdnot be zero");
				System.exit(0);
			}
			
				
		}
	
	}
}


