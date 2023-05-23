package arrays;

public class FirstElementofArrayisPrmeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,8,4,83,2};
		int n=arr[0];
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			count++;
		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}

	}

}
