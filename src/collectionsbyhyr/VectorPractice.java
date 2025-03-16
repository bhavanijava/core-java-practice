package collectionsbyhyr;

import java.util.Arrays;
import java.util.Vector;

public class VectorPractice {

	public static void main(String[] args) {
		//Size - no of elements present the list
		//Capacity - default capacity 10
		Vector v1 = new Vector();
		//add
		v1.add("shankar");
		v1.add("shankar");
		v1.add("shankar");
		v1.add("shankar");
		v1.add("shankar");
		v1.add("shankar");
		v1.add("shankar");
		v1.add("ee");
		v1.add(0,"Bhavani");
		Vector v2 = new Vector();
		v2.add("ds");
		v2.add("sfv");
		v2.add("er");
		v1.addAll(v2);
		v1.addAll(1,v2);
		//Retrival
		System.out.println(v1.get(0));
		//remove
		v1.remove(4);
		v1.remove("shankar");
		//v1.removeAll(v2);
		//v1.clear();
		
		//verification
		System.out.println(v1.contains("sfv"));
		System.out.println(v1.containsAll(v2));
		
		//update
		v1.set(0, "amma");
		
		System.out.println("Size "+v1.size());
		System.out.println("Capacity "+v1.capacity());
		System.out.println("Data "+v1);
		System.out.println("Index Of "+v1.indexOf("amma"));
		
		// converting to array
		Object[] arr = v1.toArray();
		System.out.println(Arrays.toString(arr));
		//Vector 1.0
		// collections 1.2
		// Generics 1.5
		Object[] arr1 = new Object[] {1,5,8,9,2};
		Vector v3 = new Vector(Arrays.asList(arr1));
		v3.add("java");
		//we will get casting issue thats why generics introduced
		//int sum = v3.stream().mapToInt(obj -> (Integer) obj).sum(); 
	}
}
