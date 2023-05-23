package strings;

public class PrintPalindromeWordsInGivenSentense {

	public static void main(String[] args)
	{
		String input="madam arora teaches malayalam";
		String[] arr=input.split(" ");
		String pal="";
		for(String word:arr)
		{
			if(isPalindrome(word))
			{
				//System.out.println(word);
				pal=pal+word;
			}
		}
		for(int i=0;i<=pal.length()-1;i++)
		{
			System.out.print(pal.charAt(i));
		}
		System.out.print(" ");
	}
	public static boolean isPalindrome(String input) 
	{
		int i1=0;
		int i2=input.length()-1;
		while(i2>i1)
		{
			if(input.charAt(i1)!=input.charAt(i2))
			{
				return false;
			}
			i1++;
			i2--;
		}
		
		return true;
		
	}

}
