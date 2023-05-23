package strings;

public class HighestDigitInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="coding@365";
		int n=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				int x=(int)(ch-48);
				if(x>n)
				{
					n=x;
				}
			}
		}
		System.out.println("higest digit in string "+n);
	}

}
