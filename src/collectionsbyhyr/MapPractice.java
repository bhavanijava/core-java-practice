package collectionsbyhyr;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPractice {

	public static void main(String[] args) {
		//creation of map
		Map<Integer, String> m = new Hashtable<>();
		
		//addition elements into map
		m.put(1, "naga");
		m.put(2, "padma");
		m.put(3, "muni");
		m.put(4, "bhavani");

		//* every key value we consider as entry
		// Retrival of keys from the map
		Set<Integer> keys = m.keySet();
		for(Integer key: keys) {
			//System.out.println(key);
		}
			
		// Retrival of values from the map
		Collection<String> values = m.values();
		for(String value: values) {
			//System.out.println(value);
		}
		
		// Retrival of value from the map based on key
		//System.out.println(m.get(1));

		//Deletion of element from map
		m.remove(1);
		
		System.out.println(m);
		
		//verification of key from map
		System.out.println(m.containsKey(2));
		System.out.println(m.containsKey(35));
		
		//verification of value from map
		System.out.println(m.containsValue("padma"));
		System.out.println(m.containsValue("jg"));

		//updation of element from map
		// both put and replace are same
		m.put(4, "suri");
		m.replace(4, "suri");
		//if key is not there in map then only it will add, if key present it wonnot insert
		m.putIfAbsent(4, "suri");
		
		// no of elements count in the map , it consider from 0th index as 1 size
		System.out.println(m.size());
		
		// entire map deletion
		//m.clear();
		
		// printing every element from map
		Set<Entry<Integer, String>> entries = m.entrySet();
		for(Entry<Integer, String> entry: entries) {
			System.out.println(entry);
		}

		// clone from one map to another map
		HashMap<String, String> capitalCities = new HashMap<String, String>();
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    
	    HashMap copy = (HashMap)capitalCities.clone();
	    copy.remove("England");
	    
	    System.out.println(capitalCities);
	    System.out.println(copy);
	    
	    // forEach
	    capitalCities.forEach((k, v) -> { System.out.println(k + " -> " + v); });
	    
	    // to avoid nullpointer execption when key is not present null then provide default value getOrDefault()
	    System.out.println(capitalCities.get("Canada"));
	    System.out.println(capitalCities.getOrDefault("Canada", "Unknown"));

	    // to update all values use replaceAll
	    capitalCities.replaceAll((k, v) -> "The capital of " + k + " is " + v);
	    System.out.println(capitalCities);

	    Map<String, Integer> map = new HashMap<>();
	    map.put("apple", 3);
	    map.put("banana", 2);

	    // Merging with a new value
	    map.merge("apple", 5, (oldValue, newValue) -> oldValue + newValue); 
	    // "apple" exists with value 3, so the remapping function adds 5 to 3, resulting in 8.

	    map.merge("banana", 3, (oldValue, newValue) -> oldValue * newValue);
	    // "banana" exists with value 2, so the remapping function multiplies 2 by 3, resulting in 6.

	    map.merge("cherry", 7, (oldValue, newValue) -> oldValue + newValue);
	    // "cherry" doesn't exist, so the value 7 is directly inserted.

	    System.out.println(map);

	}

	
}
