package arrays;

public class DisplayLastOddNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,6,8,7,1,5};
		for(int i=0;i<arr.length-1;i++)
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
				break;
			}
	}

}
