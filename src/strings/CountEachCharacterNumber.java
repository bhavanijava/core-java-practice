package strings;

public class CountEachCharacterNumber {

	public static void main(String[] args)
	{
		String str="abca";
		char[] arr=str.toCharArray();
		
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			System.out.println(arr[i]+" "+count);
		}
	}
}
