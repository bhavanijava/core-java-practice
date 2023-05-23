package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiInteger {

	public static void main(String[] args) 
	{
		List<Integer> list=Arrays.asList(1,2,4,3,5,6,8,9);
		Stream<Integer> st=list.stream();
		st.forEach(x->System.out.print(x+" "));
		
		System.out.println();
		//Using Stream and display the list in single line
		
		list.stream().forEach(x->System.out.print(x+" "));
	}

}
