package arrays;

import java.util.Arrays;
import java.util.List;

public class GivenarrayLessThanValues1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Integer> list=Arrays.asList(8,1,2,2,3);
		int[] arr1= {7,7,7,7};
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
		for(int i=0;i<=arr2.length-1;i++)
		{
			System.out.println(arr2[i]);
		}
		
	}
	}


