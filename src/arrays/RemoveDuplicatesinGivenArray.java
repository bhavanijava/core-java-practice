package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesinGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr= {2,3,4,5,2,3,4};
		List<Integer> list=Arrays.asList(2,3,4,5,2,3,4);
		Set<Integer> set=new HashSet<Integer>(list);
		for(Integer e:set)
		{
			System.out.println(e);
		}
	}
}
