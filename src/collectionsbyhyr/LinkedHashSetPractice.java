package collectionsbyhyr;

import java.util.LinkedHashSet;

public class LinkedHashSetPractice {

	public static void main(String[] args) {
		// LinkedHashSet - LinkedHashMap -- link of nodes(key, value)
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(2);
		lhs.add(4);
		lhs.add(1);
		lhs.add(6);
		lhs.add(null);
		lhs.add(null);

		// internally uses LinkedHashMap
		// one null value allowed
		// duplicate values not allowed
		// it maintain insertion order
		System.out.println(lhs);
	}

}
