package strings;

import java.util.Scanner;

public class ReverseSentencepalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    System.out.println("Enter a sentence: ");
		    String s = sc.nextLine();
		    isPalindrome(s);
		 String word = "", rev = "";
		   char ch;
		   String str = null;
		int len = str.length(); 
		   for(int i = 0; i < len; i++)
		   {
			ch = str.charAt(i);
		        if(ch != ' ')
		        {
		          word = word + ch;
		          rev = ch + rev;
		        }
		       else
		      {
			  if(word.equalsIgnoreCase(rev)) 
			  System.out.println("Palindrome word: " +word);	 
			  word = "";
			  rev = "";
		       }
		    }
		}

	private static void isPalindrome(String s) {
		// TODO Auto-generated method stub
		
	}
	}


