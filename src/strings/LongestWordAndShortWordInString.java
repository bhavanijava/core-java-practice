package strings;

import java.util.Arrays;

import java.util.Comparator;

public class LongestWordAndShortWordInString {

	public static void main(String[] args)
	{
		String str="This is the Longest Sentense in Java";
		
		String longword=Arrays.stream(str.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
		
		String shortword=Arrays.stream(str.split(" ")).min(Comparator.comparingInt(String::length)).orElse(null);

		System.out.println(longword);
		System.out.println(shortword);
		
		
		

		
	}

}
