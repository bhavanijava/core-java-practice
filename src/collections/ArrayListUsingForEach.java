package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUsingForEach {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<=50;i+=10)
		{
			list.add(i);
		}
		System.out.println("List is:"+list);
		for(Integer x:list)
		{
			System.out.println(x);
		}
		

	}

}
