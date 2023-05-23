package arrays;

public class PrintLeftsideGreaterValues {

	public static void main(String[] args) {
		int[] arr= {16,17,4,3,5,2};
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+2;i<arr.length;j++)
			{	
				max=arr[j];
				for(int k=j+2;k<arr.length;k++)
				{
					if(max<arr[k])
					{
						max=arr[k];
					}
					System.out.println(max);
					break;
				}
				
				
			}
			
		}

	}

}
