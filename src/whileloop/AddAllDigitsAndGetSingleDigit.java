package whileloop;

public class AddAllDigitsAndGetSingleDigit {

	public static void main(String[] args)
	{
		int n=5691;
		int sum=0;
		int d=0;
		while(n!=0||sum>9)
		{
			if(n==0)
			{
				n=sum;
				sum=0;
			}
			else
			{
				d=n%10;
				sum=sum+d;
				n=n/10;
			}
		}
		System.out.println(sum);
		
	}

}
