package strings;

public class CheckLastCharacterIsDigitOrNot {

	public static void main(String[] args) 
	{
		String s="abc@123";
		char ch=s.charAt(s.length()-1);
		if(ch>='0'&&ch<='9')
		{
			System.out.println("the Character is Digit"+ch);
		}
		else
		{
			System.out.println("Not digit");
		}
				

	}

}
