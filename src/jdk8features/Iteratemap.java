package jdk8features;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Iteratemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();
		for(int i=10;i<=50;i+=10) {
			map.put(1, "java");
			map.put(2, ".net");
			map.put(3, "python");
			map.put(4, "spoken");
			map.put(5, "servlet");
		}
		System.out.println("details are");
		Set<Integer> keys=map.keySet();         //Foreach
		for(Integer k:keys)
		{
			String v=map.get(k);
			System.out.println(k+" is "+v);
		}
		System.out.println();
		map.forEach((k,v)->System.out.println(k+"="+v));
	
	}

}
