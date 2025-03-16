package collectionsbyhyr;

import java.util.HashMap;

public class HashMapPractice {

	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("apple", 3);
		hashMap.put(null, null);
		hashMap.put("as", null);
		System.out.println(hashMap);

		// hashMap internally uses hashing mechanism
	}

}
