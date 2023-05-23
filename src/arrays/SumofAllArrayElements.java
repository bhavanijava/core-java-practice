package arrays;

public class SumofAllArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,8,3,6,3,1};
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);

	}

}
