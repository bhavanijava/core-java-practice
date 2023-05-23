package practiceforjob;
import java.util.*;

public class CollectionWithMapInterface {

	public static void main(String[] args) 
	{
//		Map<String,Double> map=new HashMap<String,Double>();
//		Scanner sc=new Scanner(System.in);
//		for(int i=1;i<=2;i++)
//		{
//			String name=sc.next();
//			double cost=sc.nextDouble();
//			map.put(name, cost);
//		}
//		Set<String> keys=map.keySet();
//		for(String k:keys)
//		{
//			Double v=map.get(k);
//			System.out.println(k+" "+v);
//		}
//		System.out.println();
		
//		Map<String,Double> map1=new LinkedHashMap<String,Double>();
//		Scanner sc1=new Scanner(System.in);
//		for(int i=1;i<=2;i++)
//		{
//			String name=sc1.next();
//			double cost=sc1.nextDouble();
//			map1.put(name, cost);
//		}
//		Set<String> keys1=map1.keySet();
//		for(String k:keys1)
//		{
//			Double v=map1.get(k);
//			System.out.println(k+" "+v);
//		}
		
		
		Map<String,Double> map1=new TreeMap<String,Double>();
		Scanner sc1=new Scanner(System.in);
		for(int i=1;i<=2;i++)
		{
			String name=sc1.next();
			double cost=sc1.nextDouble();
			map1.put(name, cost);
		}
		Set<String> keys1=map1.keySet();
		for(String k:keys1)
		{
			Double v=map1.get(k);
			System.out.println(k+" "+v);
		}
		
	}

}
