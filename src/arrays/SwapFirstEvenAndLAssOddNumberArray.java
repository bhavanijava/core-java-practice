package arrays;

public class SwapFirstEvenAndLAssOddNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,5,7,4,5,6,2,8};
		int i=0,j=0;
		
		for(i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				break;
			}
				
		}
		for( j=arr.length-1;j>=0;j--)
		{
			if(arr[j]%2!=0)
			{
				break;
			}
		}
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		System.out.println("After swap");
		
		for( i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
		
		
		
	}

}
