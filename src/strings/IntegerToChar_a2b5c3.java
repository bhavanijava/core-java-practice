package strings;

public class IntegerToChar_a2b5c3 {

	public static void main(String[] args)
	{
		String str="a2bd5c3";
		String output="";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				output=output+str.charAt(i);
			}
			else
			{
				int x=Character.getNumericValue(str.charAt(i));
		    	for(int j=1;j<x;j++)
				{
		    		output=output+str.charAt(i-1);
			    }
			}
		}
        System.out.println(output.toString()); // aabdddddccc

	}

}
