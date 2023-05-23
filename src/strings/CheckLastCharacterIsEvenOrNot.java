package strings;

public class CheckLastCharacterIsEvenOrNot {

	public static void main(String[] args) 
	{
		String s="abc@124";
		 char ch=s.charAt(s.length()-1);
		if(ch>='0'&&ch<='9')
		{
			int n=(int)(ch-48);
			if(n%2==0)
			{
				System.out.println("Even"+n);
			}
			else
			{
				System.out.println("Not Even");
			}
		}
	}

}
