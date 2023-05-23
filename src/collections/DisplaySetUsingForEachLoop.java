package collections;

import java.util.HashSet;
import java.util.Set;

public class DisplaySetUsingForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> list=new HashSet<Integer>();
		for(int i=1;i<=5;i++)
		{
			list.add(i);
		}
		System.out.println("Set is");
		for(Integer x:list)
		{
			System.out.println(x);
		}

	}

}
