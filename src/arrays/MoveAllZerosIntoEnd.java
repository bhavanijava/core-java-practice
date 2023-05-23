package arrays;

public class MoveAllZerosIntoEnd {

	public static void main(String[] args) 
	{
		int[] arr= {3,2,0,4,0,8,5};
		int cnt=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=0)
			{
				arr[cnt]=arr[i];
				cnt++;
			}
		}
		
		while(cnt<arr.length)
		{
			arr[cnt]=0;
			cnt++;
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
