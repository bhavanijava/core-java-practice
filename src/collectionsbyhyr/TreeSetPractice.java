package collectionsbyhyr;

import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {
		//TreeSet - TreeMap - binary tree
		TreeSet<Integer> hs = new TreeSet<>();
		hs.add(2);
		hs.add(4);
		hs.add(1);
		hs.add(6);
		//hs.add(null);

		// internally uses TreeMap
		//  null values not allowed
		// duplicate values not allowed
		// it maintain sorting order by default asending order
		System.out.println(hs.descendingSet());
	}

}
