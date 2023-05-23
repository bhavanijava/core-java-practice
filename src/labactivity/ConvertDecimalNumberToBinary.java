package labactivity;

import java.util.Scanner;

public class ConvertDecimalNumberToBinary {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Integer.toBinaryString(n));
	}
}
