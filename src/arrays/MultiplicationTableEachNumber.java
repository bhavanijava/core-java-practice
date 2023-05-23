package arrays;

public class MultiplicationTableEachNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,9,2,7,3,1};
		for(int x=0;x<=arr.length-1;x++)
		{
			int n=arr[x];
			for(int i=1;i<=10;i++)
			{
				System.out.println(n+"x"+i+"="+(n*i));
			}
		}

	}

}
