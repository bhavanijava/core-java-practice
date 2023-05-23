package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsClass {

	public static void main(String[] args)
	{
		List<Integer> list=Arrays.asList(1,2,3,5,6,7,8);
		List<Integer> values=list.stream().map(x->x*x).collect(Collectors.toList());
		values.forEach(System.out::println);
	}

}
