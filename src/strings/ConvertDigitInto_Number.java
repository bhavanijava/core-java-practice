package strings;

import java.util.Scanner;

public class ConvertDigitInto_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		char ch='0';
		if(ch>='0'&&ch<='9')
		{
			int x=(int)(ch-48);
			System.out.println(x);
		}
		else
		{
			System.out.println("enter valid number");
		}
	}

}
