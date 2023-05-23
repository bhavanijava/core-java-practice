package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiWithSkip_Limit_Count_Methods {

	public static void main(String[] args)
	{
		List<Integer> list=Arrays.asList(23,44,76,1,99,79);
		
		//skip method
		list.stream().skip(2).forEach(System.out::println);
		
		System.out.println();
		
		//limit method
		list.stream().limit(4).forEach(System.out::println);
		
		System.out.println();
		// skip method+limit method
		list.stream().skip(2).limit(3).forEach(System.out::println);
		
		System.out.println();

		//skip method+limit method+count method
		long countvalues=list.stream().skip(3).limit(2).count();
		System.out.println(countvalues);
		
		System.out.println();

		// counting elements
		Long count=list.stream().collect(Collectors.counting());
		System.err.println(count);
		
		
	}

}
