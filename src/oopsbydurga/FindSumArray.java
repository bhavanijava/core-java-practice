package oopsbydurga;

public class FindSumArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3};
		int res=FindSumArray.m1(arr);
		System.out.println(res);
	}

	static int m1(int[] arr)
	{
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
		}
		
		return sum;
	}
}
