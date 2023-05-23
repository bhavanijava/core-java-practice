package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamWithFilterInCollectionIntegers {

	public static void main(String[] args)
	{
		List<Integer> list=Arrays.asList(1,2,5,3,8,4,6);
		//Even Numbers
		list.stream().filter(x->x%2==0).forEach(System.out::println);
		//Odd Numbers
		System.out.println();
		list.stream().filter(s->s%2!=0).forEach(System.out::println);

	}

}
