package basic;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		int[] arr=new int[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter "+i+" value");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
