package multithreadprograms;

import java.util.Scanner;

public class Default4 {
static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("sum of First N numbers");
		System.out.println("Enter n value:");
		 Default4.n=sc.nextInt();
		 Calculation thread=new Calculation();
		 thread.start();
		 try {
		 thread.join();
		 
		 }
		 catch(Exception e) {
		 }
		 System.out.println("sum"+Calculation.sum);
		 }
	}





class Calculation extends Thread
{
	static int sum=0;
	public void run()
	{
		System.out.println("cal stars");
		for(int i=1;i<=Default4.n;i++)
		{
			Calculation.sum=Calculation.sum+i;
		}
		System.out.println("cal ends");
	}
}