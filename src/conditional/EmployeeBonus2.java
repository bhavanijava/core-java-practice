package conditional;
import java.util.Scanner;

public class EmployeeBonus2
{

	public static void main(String[] args) 
	{
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter salary:");
     double salary=sc.nextDouble();
     System.out.println("Enter Experince");
     int exp=sc.nextInt();
     double bonus=0;
     if(exp>5)
     {
    	 bonus=0.20*salary;
     }
     System.out.println("salary:"+salary);
     System.out.println("Bonus:"+bonus);
	}

}
