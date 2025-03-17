package collectionsbyhyr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorPractice {

	public static void main(String[] args) {
		// Iterator - interface
		// Introduced for iterating the all collection
		// Legacy classes -v1.0 and New class v1.2
		// One direction, read-only with special permision for removing
		
		// ListIterator for bidirectional with special permision for removing
		Integer[] arr = new Integer[] {1,2,3,4};
		ArrayList<Integer> all = new ArrayList<>(Arrays.asList(arr));
		for(Integer integer:all) {
//			System.out.println(integer);
//			System.out.println(all.remove(integer));
		}
		
		// donnot use for-each loop to remove element if use ConcurentModification exception will come
		// alternatively use Iterator
		Iterator<Integer> iterator = all.iterator();
		while(iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
		
		System.out.println(all);

	}

}
