package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPeekMethod {

	public static void main(String[] args) 
	{
		List<String> list= Arrays.asList("bhava","amar","uday");
		List<String> lis1=list.stream().filter(e->e.startsWith("a")).peek(e->System.out.println(e)).collect(Collectors.toList());
	}

}
