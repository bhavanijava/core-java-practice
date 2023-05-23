package java8features;

import java.util.*;
import java.util.stream.*;

public class CountingCharactersInStringUsingJava8 {

	public static void main(String[] args) {

		String str="bhavani";
		
		Map<Character,Long> output=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		System.out.println(output);
		
		
	}

}
