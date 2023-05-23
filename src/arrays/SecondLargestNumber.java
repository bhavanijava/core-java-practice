package arrays;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,7,9,4,6,2};
		int temp=0;
		for(int i=0;i<=arr.length-1;i++) 
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				 if(arr[i]>arr[j])
				 {
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			}
		}
	      System.out.println("The second largest number is:: "+arr[arr.length-2]);
	      for(Integer x:arr)
	      {
	    	  System.out.println(x);
	      }
	      System.out.println("The second Smallest number is:: "+arr[arr.length-5]);


		Arrays.sort(arr);
	      System.out.println("The second largest number is:: "+arr[arr.length-2]);

	}

}
