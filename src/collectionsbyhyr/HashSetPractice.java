package collectionsbyhyr;

import java.util.HashSet;

public class HashSetPractice {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(2);
		hs.add(4);
		hs.add(1);
		hs.add(6);
		hs.add(null);

		// internally uses LinkedHashMap
		// one null value allowed
		// duplicate values not allowed
		// does not maintain insertion order
		System.out.println(hs);
	}

}
