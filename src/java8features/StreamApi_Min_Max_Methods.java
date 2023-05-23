package java8features;

import java.util.*;

public class StreamApi_Min_Max_Methods {

	public static void main(String[] args)
	{
		List<Integer> list= Arrays.asList(99,2,3,4,56,7,89,10);
		Integer small=list.stream().min((e1,e2)->e1.compareTo(e2)).get();
		System.out.println(small);
		
		System.out.println();
		Integer biggest=list.stream().max((e1,e2)->e1.compareTo(e2)).get();
		System.out.println(biggest);
		
		System.out.println();
		
	}

}
