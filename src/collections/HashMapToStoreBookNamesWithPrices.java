package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapToStoreBookNamesWithPrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Double> map=new HashMap<String,Double>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 Details");
		for(int i=1;i<=3;i++)
		{
			System.out.println("Book_"+i+"_Details");
			String name=sc.next();
			double price=sc.nextDouble();
			map.put(name, price);
		}
		System.out.println("details are");
		Set<String> keys=map.keySet();
		for(String k:keys)
		{
			Double v=map.get(k);
			System.out.println(k+"="+v);
		}
	}

}
