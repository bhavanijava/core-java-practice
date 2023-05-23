package arrays;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder 
{
	public static void main(String[] args)   
	{   
	Integer [] array = {23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205};   
	// sorts array[] in descending order   
	Arrays.sort(array, Collections.reverseOrder());   
	for(int i=0;i<=array.length-1;i++)
	{
		System.out.println(array[i]);
	}
	System.out.println("Array elements in descending order: " +Arrays.toString(array));   
	}   

}
