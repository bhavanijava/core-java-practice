package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ElmentsSortingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(10,20,60,40,50);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
	}

}
