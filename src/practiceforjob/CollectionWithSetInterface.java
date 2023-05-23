package practiceforjob;
import java.util.*;
public class CollectionWithSetInterface
{
	public static void main(String[] args) 
	{
		Set<Integer> set=new HashSet<Integer>();
		set.add(12);
		set.add(16);
		set.add(88);
		set.add(54);
		set.add(null);
		set.add(null);
		System.out.println(set);
		System.out.println();
		
		Set<Integer> set1=new LinkedHashSet<Integer>();
		set1.add(12);
		set1.add(16);
		set1.add(88);
		set1.add(54);
		set1.add(null);
		set1.add(null);
		System.out.println(set1);
		System.out.println();
		
		Set<Integer> set11=new TreeSet<Integer>();
		set11.add(12);
		set11.add(16);
		set11.add(88);
		set11.add(54);
		set.add(null);
		set.add(null);
		System.out.println(set11);
		System.out.println();
		
		

	}
	
}
