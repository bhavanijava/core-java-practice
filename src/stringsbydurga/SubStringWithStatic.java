package stringsbydurga;

import java.util.Scanner;

public class SubStringWithStatic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String res=SubStringWithStatic.m1(str);
		System.out.println(res);
		
		String vowels=SubStringWithStatic.m2(str);
		System.out.println(vowels);
	}
	
	static String m1(String str)
	{
		 String sub=str.substring(3,6);
		
		return sub;
	}
	
	static String m2(String str)
	{
		String vowels="";
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowels=vowels+ch+" ";
			}
		}
	    return vowels; // return the string of vowels

	}

}
