package java8features;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ForEach_method {

	public static void main(String[] args)
	{
				//Iterating LIST
		List<String> courses=Arrays.asList("c","java","python");
		//using lambda expression
		courses.forEach(course->System.out.println(course));
		
		//using method references:
		System.out.println();
		courses.forEach(System.out::println);
		
				//Iterating Set
		System.out.println();

		Set<String> uniqueNames=new LinkedHashSet<>(Arrays.asList("c","java","python","python"));
		//using lambda expression
		uniqueNames.forEach(uniqueName->System.out.println(uniqueName));
		
		//using method references:
		System.out.println();
		uniqueNames.forEach(System.out::println);
		
				//Iterating Map
		System.out.println();
		Map<Integer,String> namesMap=new HashMap<Integer,String>();
		namesMap.put(1, "Naga");
		namesMap.put(2, "Murali");
		namesMap.put(3, "Pranav");
		namesMap.put(4, "Bhavani");
		
		//Iterate map
		namesMap.forEach((key,value)->System.out.println(key+" "+value));
		
		System.out.println();

		//Iterating Map using entrySet:
		namesMap.entrySet().forEach(entry->System.out.println(
				entry.getKey()+" "+entry.getValue()
				));
	}

}
