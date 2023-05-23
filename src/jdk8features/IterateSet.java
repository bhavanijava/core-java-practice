package jdk8features;

import java.util.LinkedHashSet;
import java.util.Set;

public class IterateSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set=new LinkedHashSet<Integer>();
		for(int i=10;i<=50;i+=10)
		{
			set.add(i);
		}
		System.out.println("details are");
		//for(Integer e:set)
		//{
			//System.out.println(e);
		//}
		
		set.forEach(x->System.out.println(x));
	}

}
