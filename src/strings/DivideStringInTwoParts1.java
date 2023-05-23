package strings;

public class DivideStringInTwoParts1 {

	public static void main(String[] args)
	{
		String s="abfctd";
		
		
		int n=2;
		int len=s.length();
		int stringpart=len/n;
		System.out.println(stringpart);
		
		String[] s1=new String[n];
		
		int temp=0;
		if(len%n==0)
		{
			for(int i=0;i<len;i=i+stringpart)
			{
				String part=s.substring(i,i+stringpart);
				s1[temp]=part;
				temp++;
				System.out.println(part);
				
			}
		}
		else if(!(len%n==0))
		{
			System.out.println("We cannot do "+n+" equal parts");
		}
	}

}
