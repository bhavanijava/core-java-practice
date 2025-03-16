package collectionsbyhyr;

import java.util.TreeMap;

public class TreeMapPractice {

	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("grapes", 3);
		treeMap.put("banana", 2);
		treeMap.put("cherry", 5);
		//treeMap.put(null, 5);
		System.out.println(treeMap);
	}

}
