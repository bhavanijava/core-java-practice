package collections;
import java.util.*;
public class MapUsingForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] k= {101,102,103,104};
		String[] v= {"aa","bb","cc","dd"};
		Map<Integer,String> map=new HashMap<Integer,String>();
		for(int i=0;i<=k.length-1;i++)
		{
			map.put(k[i], v[i]);
			
		}
		System.out.println("Map is");
		Set<Integer> keys=map.keySet();
		for(Integer key:keys)
		{
			String val=map.get(key);
			System.out.println(key+"="+val);
		}
		
	}

}
