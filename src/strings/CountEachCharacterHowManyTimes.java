package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountEachCharacterHowManyTimes {

	public static void main(String[] args)
	{
		String str="zaaabbbaccccddacddz";
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		
		// string to char array
		char[] arr=str.toCharArray();

		for(Character ch:arr)
		{
			if(!map.containsKey(ch))
			{
				map.put(ch,1);
			}
			else
			{
				int value=map.get(ch);
				map.put(ch, value+1);
			}
		}
		System.out.println(map);
	}

}
