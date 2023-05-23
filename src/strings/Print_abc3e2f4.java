package strings;

public class Print_abc3e2f4 {

	public static void main(String[] args)
	{
		String s="a2b5c3a4";
		
		System.out.println("Input is :"+s);
		
		System.out.println("output is :");
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			char ch1=s.charAt(i+1);
			if(ch1>='0'&&ch1<='9')
			{
				for(int j=0;j<=(int)(ch1-48)-1;j++)
				{
					System.out.print(ch);
				}
				i++;
			}
			else
			{
				System.out.print(ch);
			}
		}
		System.out.println();
	}

}
