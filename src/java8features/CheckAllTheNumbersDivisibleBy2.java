package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckAllTheNumbersDivisibleBy2 {

	public static void main(String[] args)
	{
		List<Integer> list=Arrays.asList(2,4,6);
		boolean flag=list.stream().allMatch(n->n%2==0);
		if(flag) 
		{
			System.out.println("all numbers are divisible by 2");
		}
		else
		{
			System.out.println("all numbers are not divisible by 2");
		}
		
		//separating even numbers and odd numbers

		List<Integer> evenList=list.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenList);
		
		List<Integer> oddList=list.stream().filter(n->n%2!=0).collect(Collectors.toList());
		System.out.println(oddList);
	}

}
