package strings;

import java.util.Scanner;

public class CharacterIsVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter character:");
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i')
		{
			System.out.println("It is vowel");
		}
		else
		{
			System.out.println("it is consonant");
		}
	}

}
