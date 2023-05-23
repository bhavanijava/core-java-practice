package strings;

public class FindAlphabets_Digits_SymbolsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Coding@132";
		int c1=0,c2=0,c3=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
			{
				c1++;
				
			}
			else if(ch>='0'&&ch<='9')
			{
				c2++;
			}
			else {
				c3++;
				
			}
		}
		System.out.println("Alphabets are"+c1);
		
		System.out.println("Digits are"+c2);
		System.out.println("Symbols are"+c3);

	}
	

}
