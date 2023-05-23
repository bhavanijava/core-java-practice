package java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiSortedMethod {

	public static void main(String[] args)
	{
		List<Integer> list=Arrays.asList(7,2,19,76,1);
		
		//ascendiing Order
		list.stream().sorted().forEach(System.out::println);
		System.out.println();
		
		
		//descending order without camparator
		List<Integer> desc=list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		desc.forEach(System.out::println);
		
		System.out.println();
		//descending order with compareTo Method
		
		List<Integer> desc2=list.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
		desc2.forEach(System.out::println);
		
		System.out.println();
		//descending order with Comparator Method
		
		Comparator<Integer> com = (e1,e2)->{
		
		if(e1>e2)
		{
			return -1;
		}
		else if(e1<e2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	};
	list.stream().sorted(com).forEach(System.out::println);

		
	}

}
