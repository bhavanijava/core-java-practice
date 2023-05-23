package collections;
import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class DisplayUsingSetThroughIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set=new HashSet<Integer>();
		for(int i=1;i<=5;i++)
		{
			set.add(i*10);
		}
		System.out.println("Set is");
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext())
		{
			Integer x=itr.next();
			System.out.println(x);
		}
		
		

	}

}
