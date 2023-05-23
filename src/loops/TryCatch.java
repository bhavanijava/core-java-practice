package loops;
import java.util.Scanner;
import java.util.InputMismatchException;
public class TryCatch 
{

	public static void main(String[] args) 
	{
	  	Scanner sc=new Scanner(System.in);
	  	try
	  	{
	  		System.out.println("enter 2 number");
	  		int a=sc.nextInt();
	  		int b=sc.nextInt();
	  		int c=a+b;
	  		System.out.println("sumn: "+c);
	  	}
	  	catch(InputMismatchException e)
	  	{
	  	  System.out.println("Exeption:Input must be integers only");
	  	}
	  
  }
}
