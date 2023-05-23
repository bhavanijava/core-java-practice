package arrays;

public class RemoveDuplicates {

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,1,2,3,4};

		for (int i = 0; i < arr.length; i++)   
		{  
			for (int j = i + 1; j < arr.length; j++)   
			{  
				int tmp = 0;  
				if (arr[i] > arr[j])   
				{  
					tmp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = tmp;  
				}  
			}  
			System.out.println(arr[i]);  
		} 
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
			if(j!=i) 
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

}
