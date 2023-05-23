package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUsingForEachReveseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		for(int i=10;i<=50;i+=10)
		{
			list.add(i);
			
		}
		System.out.println("List is"+list);
		System.out.println("ReverseOrder");
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.println(list.get(i));
		}
	}

}
