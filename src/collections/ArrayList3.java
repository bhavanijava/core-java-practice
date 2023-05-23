package collections;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=5;i>=2;i--)
		{
			list.add(i+2*i);
		}
		System.out.println("List:"+list);
		list.add(list.size()+1);
		System.out.println("List:"+list);
		list.add(7);
		System.out.println("List:"+list);
		list.add(2,3);
		System.out.println("List:"+list);
		
		list.add(8);
		System.out.println("List:"+list);
		list.add(35);
		System.out.println("List:"+list);
		list.remove(3);
		System.out.println("List:"+list);
		list.set(2, 8);
		System.out.println("List:"+list);
		list.remove(5);
		System.out.println("List:"+list);
		System.out.println(list.get(4));
		
		
		
	}

}
