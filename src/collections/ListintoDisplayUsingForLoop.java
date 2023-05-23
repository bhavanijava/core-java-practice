package collections;

import java.util.ArrayList;
import java.util.List;

public class ListintoDisplayUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		for(int i=50;i>=10;i-=10)
		{
			list.add(i);
		}
		System.out.println("List is:");
		for(int i=0;i<=list.size()-1;i++)
		{
			System.out.println(list.get(i));
		}

	}

}
