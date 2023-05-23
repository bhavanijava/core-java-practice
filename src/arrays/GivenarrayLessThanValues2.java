package arrays;

import java.util.Arrays;

public class GivenarrayLessThanValues2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Integer> list=Arrays.asList(8,1,2,2,3);
		int[] arr1= {6,5,4,8};
		int[] arr2=new int[4];
	
		for(int i=0;i<=arr1.length-1;i++)
		{
			int count=0;
			for(int j=0;j<=arr1.length-1;j++)
			{
				if(arr1[i]>arr1[j])
				{
					count++;
				}
			}
			arr2[i]=count;			
		}
				
		System.out.println("o/p: "+ Arrays.toString(arr2)); 
		
	}
	}


