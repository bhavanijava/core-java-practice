package java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamApiMethodsComparator {

	public static void main(String[] args)
	{
		List<Integer> list1=Arrays.asList(23,44,76,1,99,79,99);
		//list.stream().parallel().forEach(System.out::println);
		
		// sorted method
		list1.stream().sorted().forEach(System.out::println);
		
		System.out.println();
		//
//		Collections.reverse(list);
//		System.out.println(list);
		
		//not work reverse method
		//list.stream().sorted().reverse().forEach(System.out::println);

		
//		Comparator<Integer> com = (e1,e2)->{
//			
//			if(e1>e2)
//			{
//				return -1;
//			}
//			else if(e1<e2)
//			{
//				return 1;
//			}
//			else
//			{
//				return 0;
//			}
//			
//		};
//		
//		list.stream().sorted(com).forEach(System.out::println);
//		int[] a= {56,99,44,65,2};
//		Arrays.sort(a);
//	      System.out.println(Arrays.toString(a));
	      List<Integer> list=Arrays.asList(56,99,44,65,2);
	      Collections.sort(list);
	      System.out.println(list);
	      Collections.reverse(list);
	      System.out.println(list);

	}

}
