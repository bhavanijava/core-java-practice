package strings;

public class DisplayCountAlphabets_Digits_symbols {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= {'a','b','c','@','1','2','3'};
		int alpha=0,digit=0,sym=0;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			char ch=arr[i];
			if((ch>='A'&& ch<='Z')||(ch>='a'&&ch<='z'))
			{
				alpha++;
				
			}
			else if(ch>='0'&&ch<='9')
			{
				digit++;
			}
			else {
				sym++;
			}

		}
		System.out.println("alphabets = "+alpha);
		System.out.println("digits = "+digit);
		System.out.println("Symbols = "+sym);


	}

}
