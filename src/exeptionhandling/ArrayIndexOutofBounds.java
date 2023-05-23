package exeptionhandling;
import java.util.*;

public class ArrayIndexOutofBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int[] arr= {5,7,8,10,20};
		System.out.println(arr[76]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: array elements are out of index");
		}
		
	}

}
