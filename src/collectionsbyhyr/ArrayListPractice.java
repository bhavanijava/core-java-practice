package collectionsbyhyr;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {1,2,3,4};
		ArrayList<Integer> all = new ArrayList<>(Arrays.asList(arr));
		System.out.println(all);
		System.out.println(all.size());
		all.set(0, 33);
		System.out.println(all);
		System.out.println(all.subList(0, all.size()-1));
	}

}
