package java8features;

import java.util.Arrays;
import java.util.List;

public class ListOfIntegersUsingForEachMethod {

	public static void main(String[] args)
	{
		List<Integer> list=Arrays.asList(10,20,30,40,50);
		list.forEach(x->System.out.println(x));
	}

}
