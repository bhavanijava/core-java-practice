package loops;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		
		while(n!=0)
		{
			int d=n%10;
			int count=0;
			for(int i=1;i<=d;i++)
			{
				if(d%i==0)
				{
					count++;
				}
			}
		
		if(count==2)
		{
			System.out.println(d+"is prime number");
		}
		else
		{
			System.out.println(d+"is not prime number");
		}
		n=n/10;
	}
}
}
