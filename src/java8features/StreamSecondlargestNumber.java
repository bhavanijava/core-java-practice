package java8features;

import java.util.Arrays;
import java.util.List;

public class StreamSecondlargestNumber {

	public static void main(String[] args)
	{
		List<Integer> list= Arrays.asList(99,2,3,4,56,7,89,10);
		list.stream().sorted().skip(6).limit(1).forEach(System.out::println);
	}

}
