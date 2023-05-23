package java8features;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class StreamApiWithCollectorClassWithtoList_toSet_toMapMethods {

	public static void main(String[] args) 
	{
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1, "Apple" ,100));
		list.add(new Product(2, "banana" ,99));
		list.add(new Product(3, "Grapes" ,76));
		list.add(new Product(3, "Jam" ,36.25));
		
		//with collection
		/*
		 * Iterator<Product> itr=list.iterator();
		 *  while(itr.hasNext()) { 
		 *  Product e=itr.next();
		 *   System.out.println(e.id+" "+e.name+" "+e.price);
		 *    }
		 */
		
		// with java 8 features
		//System.out.println();
		
		// toList() Method
		List<Double> pricevalue=list.stream().map(p->p.price).collect(Collectors.toList());
		pricevalue.forEach(System.out::println);
		
		System.out.println();

		// toSet() Method
		Set<Double> pricevalue1=list.stream().map(p->p.price).collect(Collectors.toSet());
		pricevalue1.forEach(System.out::println);
		System.out.println();


		// toMap() Method
		
		Map<String, Double> pricevalue2=list.stream().collect(Collectors.toMap(p->p.name,p->p.price));
		System.out.println(pricevalue2);
		
				System.out.println();

		// to Store Specific Collection
		
		List<Integer> values=list.stream().map(p->p.id).collect(Collectors.toCollection(LinkedList::new));
		values.forEach(System.out::println);
		
		System.out.println();
		Long count=list.stream().collect(Collectors.counting());
		System.out.println(count);
		
		System.out.println();
		//	summing the all product cost
		Double addition=list.stream().collect(Collectors.summingDouble(p->p.price));
		System.out.println(addition);

		System.out.println();
		Double average=list.stream().collect(Collectors.averagingDouble(p->p.price));
		System.out.println(average);

		System.out.println();
	}

}
