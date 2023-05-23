package arrays;

public class SwapTwoNumbersArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,9,4,6,8,2};
		int temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		System.out.println("After Swap");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
