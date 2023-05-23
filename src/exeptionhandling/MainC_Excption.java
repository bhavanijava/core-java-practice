package exeptionhandling;
import java.util.*;

class InvalidAgeException extends Exception{
	InvalidAgeException(String name){
		super(name);
	}
}
class person{
	public static void canVote(int age) throws InvalidAgeException{
		if(age>=18)
		{
			System.out.println("Can Vote");
		}
		else
		{
			InvalidAgeException obj=new InvalidAgeException("Invalid Age");
			throw obj;
		}
	}
}


public class MainC_Excption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Age");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try {
			person.canVote(age);
		}
		catch(InvalidAgeException e) {
			System.out.println("Exception:"+e.getMessage());
		}
	}

}
