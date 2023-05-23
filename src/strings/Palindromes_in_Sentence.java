package strings;

import java.util.Scanner;

public class Palindromes_in_Sentence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String S=sc.nextLine();
		//madam arora teaches malayalam
		String[] arr=S.split(" ");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			String Word = arr[i];
			String rev="";
				for(int j=Word.length()-1;j>=0;j--)
				{
					rev=rev+Word.charAt(j);
				}
				if(rev.equalsIgnoreCase(Word))
				{
					System.out.print(arr[i] + " ");
				}
				
		}
	}
}