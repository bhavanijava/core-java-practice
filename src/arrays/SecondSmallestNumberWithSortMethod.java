package arrays;

import java.util.Arrays;

public class SecondSmallestNumberWithSortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      int arr[] = {10, 20, 25, 63, 96, 57};
	      Arrays.sort(arr);
	      System.out.println(Arrays.toString(arr));
	      System.out.println("Second Small Number "+arr[1]);
	      System.out.println("Second Largest number "+arr[4]);
	}

}
