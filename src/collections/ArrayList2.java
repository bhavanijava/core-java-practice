package collections;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=10;i<=50;i+=10)
		{
		list.add(i);
		}
		System.out.println("list:"+list);
		list.add(2,15);
		System.out.println("list:"+list);
		list.add(0,25);
		System.out.println("list:"+list);
		list.add(70);
		System.out.println("list:"+list);
		list.set(2,35);
		System.out.println("list:"+list);
		list.set(2, 45);
		System.out.println("list:"+list);
		list.remove(2);
		list.remove(3);
		System.out.println("list:"+list);
		list.remove(4);
		System.out.println("list:"+list);
		System.out.print(list.get(2));
		
	

	}

}
