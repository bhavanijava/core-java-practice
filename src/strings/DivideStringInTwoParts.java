package strings;

public class DivideStringInTwoParts {

	public static void main(String[] args)
	{
		String str="asssdpqr";
		System.out.println("Input : "+str);
		
		String str1="";
		String str2="";
		
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='s'||ch=='d')
			{
				str1=str1+ch;
			}
			else
			{
				str2=str2+ch;
			}
		}
		System.out.println("O/P :");
		System.out.println(str1);
		System.out.println(str2);
	}

}
