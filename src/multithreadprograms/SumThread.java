package multithreadprograms;

import java.util.Scanner;

public class SumThread {
	static int n=0;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("sum of first n numbers");
		System.out.println("Enter  n value");
		SumThread.n=sc.nextInt();
		
		Calc obj=new Calc();
		obj.start();
		try
		{
			obj.join();
		}
		catch(Exception e) {
		}
		System.out.println("Sum value"+Calc.sum);

	}

}
class Calc extends Thread
{
	static int sum=0;
	public void run()
	{
		for(int i=0;i<=SumThread.n;i++)
		{
			Calc.sum=Calc.sum+i;
		}
	}
}