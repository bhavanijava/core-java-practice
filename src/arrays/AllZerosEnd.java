package arrays;

public class AllZerosEnd {

	public static void main(String[] args)
	{
		int [] arr = {0, 4, 2, 0};
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] == 0)
			{
				for (int j = i + 1; j < arr.length; j++) 
				{
					if (arr[j] != 0)
					{
					 int temp  = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
						break;
				    }
				}
				System.out.println(arr[i]);
			  }
			}	
		}
	
	}
