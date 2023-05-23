package collections;

import java.util.ArrayList;

public class Code {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println("List"+list);	
		list.add(0,40);
		list.add(1,50);
		list.add(2,60);
		System.out.println("List"+list);
		list.remove(1);
		list.remove(3);
		System.out.println("List"+list);
		list.set(2, 60);
		list.set(1, 70);
		System.out.println("list:"+list);
		list.clear();
		System.out.println("List:"+list);
		
	}

}
