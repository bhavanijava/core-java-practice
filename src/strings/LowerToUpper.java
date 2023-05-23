package strings;

import java.util.Scanner;

public class LowerToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character");
		char ch=sc.next().charAt(0);
		if(ch>='a'&&ch<='z')
		{
			System.out.println(ch+"="+(char)(ch-32));
		}

	}

}
