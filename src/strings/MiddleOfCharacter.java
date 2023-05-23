package strings;

public class MiddleOfCharacter {

	public static void main(String[] args) 
	{
		String string="abcdefgj";
		System.out.println(string.length());
//		int m=string.length()/2;
//		System.out.println(string.charAt(m));
		
		String res=MiddleOfCharacter.getMiddle(string);
		System.out.println(res);
	}

	public static String getMiddle(String string) {
	    int length = string.length();
	    int middleIndex = length / 2;
	    	System.out.println(middleIndex);
	    if (length % 2 == 0) {
	        // If length is even, return two middle characters
	        return string.substring(middleIndex-1, middleIndex+1);
	    } else {
	        // If length is odd, return middle character
	        return string.substring(middleIndex, middleIndex+1);
	    }
	}

}
