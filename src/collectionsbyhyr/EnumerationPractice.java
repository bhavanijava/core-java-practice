package collectionsbyhyr;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationPractice {

	public static void main(String[] args) {
		// Enemuration - Interface
		// introduced to itrate legacy collection objects
		// Legacy classes -1.0
		// HashTable, Stack, Vector, Dictonary and Properties
		// New classes - v1.2
		
		Vector<String> v = new Vector<>();
		v.add("Banana");
		v.add("Banana");
		v.add("Banana");
		
		Enumeration<String> enumeration= v.elements();
		
		 while (enumeration.hasMoreElements()) {
	            System.out.println(enumeration.nextElement());
	        }
	}

}
