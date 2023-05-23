package strings;

import java.util.Scanner;

public class UpperLetterTolower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		if(ch>='A'&&ch<='Z')
		{
			System.out.println(ch+"="+(char)(ch+32));
		}
	}

}
