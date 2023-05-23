package strings;

public class CountNumberOfCharactersInString {

	public static void main(String[] args) 
	{
		String s="abc,xyz,pq";
		System.out.println("Input : "+s);
		String[] arr=s.split(",");
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			String str=arr[i];
			for(int j=0;j<=str.length()-1;j++)
			{
				char ch=str.charAt(j);
				if(ch>='a'&&ch<='z')
				{
					count++;
				}
			}
		}
		System.out.println("O/P : "+count);
		
		
		// Or
		
		String s1="abc,xyz,pq";
		System.out.println("Input : "+s);
		
		int count1=0;
		for(int h=0;h<=s1.length()-1;h++)
		{
			char ch1=s1.charAt(h);
			if(ch1>='a'&&ch1<='z')
			{
				count1++;
			}
			
		}
		System.out.println("O/P : "+count1);
		
		
		
	}

}
