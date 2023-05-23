package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionWithMap {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(101, "Fifty");
		map.put(102, "Fourty");
		map.put(103, "Thirty");
		map.put(104,"twenty");
		map.put(105, "Ten");
		System.out.println("Hash Map is:"+map);
		Map<Integer,String> map1=new LinkedHashMap<Integer,String>();
		map1.put(101, "Fifty");
		map1.put(102, "Fourty");
		map1.put(103, "Thirty");
		map1.put(104,"twenty");
		map1.put(105, "Ten");
		System.out.println("LinkedHashMap is:"+map1);
		Map<Integer,String> map2=new TreeMap<Integer,String>();
		
		map2.put(101, "Fifty");
		map2.put(102, "Fourty");
		map2.put(103, "Thirty");
		map2.put(104,"twenty");
		map2.put(105, "Ten");
		System.out.println("Treemap is:"+map2);
	}
	

}
