package strings;

import java.util.Scanner;

public class Madam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string");
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);
		
		if(str.equals(rev))
		{
			System.out.println(str+" is palindrome");
		}
		else
		{
			System.out.println(str+" isnot palindrome");
		}
		
		
	}

}
