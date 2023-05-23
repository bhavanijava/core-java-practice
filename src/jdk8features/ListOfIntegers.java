package jdk8features;

import java.util.ArrayList;
import java.util.List;

public class ListOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		for(int i=10;i<=50;i+=10)
		{
			list.add(i);
		}
		//System.out.println("Details are"+list);
		//for(Integer a:list) {
			//System.out.println(a);
		//}
		list.forEach(x->System.out.println(x));
	}

}
