package collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AscendingOrder {

	public static void main(String[] args)
	{
		List<Integer> list=Arrays.asList(2,6,7,1,5);
//		Collections.sort(list);
//		System.out.println(list);
//		//descending order
//		Collections.reverse(list);
//		System.out.println(list);
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	}

}
