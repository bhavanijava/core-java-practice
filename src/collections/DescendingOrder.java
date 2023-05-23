package collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DescendingOrder {

	public static void main(String[] args)
	{
		List<Integer> list=Arrays.asList(2,6,7,1,5);
		Collections.sort(list);
		System.out.println(list);
	}

}
