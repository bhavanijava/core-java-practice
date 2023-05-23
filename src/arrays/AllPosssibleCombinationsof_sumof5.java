package arrays;

public class AllPosssibleCombinationsof_sumof5 {

	public static void main(String[] args) {
		
		int[] arr= {0,1,2,3,4,12,11,5};
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]+arr[j]==5)
				{
					System.out.println("all possible combinations of 5 is "+arr[i]+","+arr[j]);
				}
			}
		}
	}

}
