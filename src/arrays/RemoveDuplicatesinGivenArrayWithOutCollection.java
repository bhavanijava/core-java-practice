package arrays;

import java.util.Arrays;

public class RemoveDuplicatesinGivenArrayWithOutCollection {

	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,1,2,3,4};
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		for(int i=0;i<=arr.length-1;i++)
		{
			int j=0;
			for(j=0;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					break;
				}
			}
			if(j==i) 
			{
				System.out.print(arr[i]+" ");
			}
		}

	}	
}
