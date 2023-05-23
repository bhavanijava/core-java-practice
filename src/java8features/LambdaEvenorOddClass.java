package java8features;

public class LambdaEvenorOddClass {

	public static void main(String[] args) 
	{
		LamdaEvenorOdd obj=(n)->n%2==0;
		System.out.println("8"+obj.isEven(8));						
	}

}
