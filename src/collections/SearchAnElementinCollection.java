package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchAnElementinCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(2);
		list.add(67);
		System.out.println(list);
		int ele=40;
		if(list.contains(ele))
		{
			System.out.println(" present Location: "+list.indexOf(ele));
		}
		else
		{
			System.out.println("Not Found");
		}
		

	}

}
