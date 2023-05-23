package jdk8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Integer[] arr= {2,3,4,5,6,7,8};
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<=arr.length-1;i++)
		{
			list.add(arr[i]);
		}
		list.stream().filter(i->i%2==0).map(i->i*i).filter(i->i<50).forEach(System.out::println);*/
		
		List<Integer> list=Arrays.asList(2,3,4,5,6,7,8,9);
		//list.stream().filter(i->i%2==0).map(i->i*i).forEach(System.out::println);

		list.stream().filter(i->i%2==0).map(i->i*i).filter(i->i<50).forEach(System.out::print);

	}

}


