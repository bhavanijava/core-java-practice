package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamWithFilterInCollection {

	public static void main(String[] args)
	{
		List<String> list=Arrays.asList("Java","JDBC","Servlets","JSP","Hibernate","Spring","SpringBoot");
		Stream<String> st=list.stream();
		Stream<String> res=st.filter(s->s.startsWith("S"));
		res.forEach(System.out::println);
		
		//single line
		System.out.println();
		
		list.stream().filter(s->s.startsWith("S")).forEach(System.out::println);
		System.out.println();

		
		list.stream().filter(s->s.endsWith("t")).forEach(System.out::println);
		
		//whose length is 4
		System.out.println();
		list.stream().filter(s->s.length()==4).forEach(System.out::println);
		
		
		
	}

}
