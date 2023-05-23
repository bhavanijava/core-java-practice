package ideyalabs;

public class EvenAndOdd {

	public static void main(String[] args)
	{
int[] arr= {2,8,4,66,99,0,1};
		
		int n=arr.length-1;
		for(int i=0;i<=arr.length-1;i++)
		{
			
			if(arr[i]%2!=0)
			{
				System.out.print("Odd"+" ");
			}
			else
			{
				System.out.print("even"+" ");
			}
		}
		System.out.println(" ");

	}

}
