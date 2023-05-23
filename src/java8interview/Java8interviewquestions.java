package java8interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Java8interviewquestions {

	public static void main(String[] args) {
		
		// Counting Characters from string
		String input="bhavanisankar";
		Map<String, Long> result = Arrays.stream(input.split(""))
									.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		System.out.println(result);
		
		//find duplicates in String
		List<String> duplictae=Arrays.stream(input.split(""))
								.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
								.entrySet().stream()
								.filter(x->x.getValue()>1)
								.map(Map.Entry::getKey)
								.collect(Collectors.toList());
		System.out.println(duplictae);
		
		//unique values
		List<String> unique=Arrays.stream(input.split(""))
							.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
							.entrySet().stream()
							.filter(x->x.getValue()==1)
							.map(Map.Entry::getKey)
							.collect(Collectors.toList());
		System.out.println(unique);
	}

}
