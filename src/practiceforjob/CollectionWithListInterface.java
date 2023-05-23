package practiceforjob;
import java.util.*;

public class CollectionWithListInterface {
	public static void main(String[] args)
	{
		List<Integer> list=new ArrayList<Integer>();
		list.add(0,14);
		System.out.println(list);
		list.add(1,12);
		System.out.println(list);
		list.add(2,19);
		list.add(3,87);
		list.add(4,null);
		list.add(5,null);
		System.out.println(list);
		list.set(1, null);
		list.add(2,10);
		System.out.println(list);
		
		Stack<Integer> list1=new Stack<Integer>();
		list1.push(1);
		list1.push(2);
		list1.push(3);
		list1.push(null);
		System.out.println(list1);
		System.out.println(list1.search(1));
		System.out.println(list1.search(null));
		

		
	}	
}
