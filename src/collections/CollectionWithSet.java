package collections;


import java.util.*;

public class CollectionWithSet {

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<Integer>();
		s.add(50);
		s.add(40);
		s.add(30);
		s.add(20);
		s.add(10);
		System.out.println(s);
		Set<Integer> s1=new LinkedHashSet<Integer>();
		
		s1.add(50);
		s1.add(67);
		s1.add(30);
		s1.add(20);
		s1.add(10);
		System.out.println(s1);
		Set<Integer> s2=new TreeSet<Integer>();
		s2.add(50);
		s2.add(40);
		s2.add(30);
		s2.add(20);
		s2.add(10);
		System.out.println(s2);
		
	}

}
