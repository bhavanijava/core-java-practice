package jdk8features;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String[] arr= {"java","spring","python","hybernate","jsp"};
		Integer[] arr= {8,4,7,2,14,76,45};
		//List<String> list=new ArrayList<String>();
		List<Integer> list=new ArrayList<Integer>();

		for(int i=0;i<=arr.length-1;i++)
		{
			list.add(arr[i]);
		}
		System.out.println("Details are"); 
		
		/*before jdk
	display names starts with s
		for(String s:list) {
			if(s.charAt(0)=='s') {
				System.out.println(s);
			}
		}*/
		
		
		System.out.println();
		
		//with stram and filter
		Stream<Integer> str=list.stream();
		//Stream<String> res=str.filter(x->x.charAt(0)=='s');
		//Stream<String> res=str.filter(x->x.length()>4);
		Stream<Integer> res=str.filter(x->x%2==0);

		res.forEach(System.out::println);
	}

}
