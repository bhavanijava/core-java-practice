package arrays;

public class DisplayPrimeNumbersofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,2,8,1,7,9};
		for(int x=0;x<=arr.length-1;x++)
		{
			int n=arr[x];
			int count=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==2)
				System.out.println(n+"prime");
			else
			{
				System.out.println(n+"not prime");
			}
		}

	}

}
