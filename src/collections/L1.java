package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class L1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(10);
		list.add(null);
		System.out.println("Details are");
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext())
		{
			Integer x=itr.next();
			System.out.println(x);
		}
		
	}

}
