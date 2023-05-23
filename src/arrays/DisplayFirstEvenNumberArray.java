package arrays;

public class DisplayFirstEvenNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,7,8,0,2};
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
				break;
			}
		}
	}

}
