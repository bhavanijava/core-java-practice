package java8features;

import java.util.Arrays;
import java.util.List;

public class StreamApiReduceMethod {

	public static void main(String[] args) 
	{
		List<Integer> list= Arrays.asList(99,2,3,4,56,7,89,10);
		list.stream().reduce((e1,e2)->e1+e2).ifPresent(System.out::println);
	}

}
