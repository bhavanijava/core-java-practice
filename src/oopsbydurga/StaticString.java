package oopsbydurga;

public class StaticString {

	public static void main(String[] args) {
		String str="bhavani";
		String res=StaticString.m1(str);
		System.out.println(res);
	}

	static String m1(String str) {
	    String vowels = ""; // initialize an empty string to store the vowels
	    for(int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);
	        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	            vowels += ch + " "; // add the vowel and a space to the string of vowels
	        }
	    }
	    return vowels; // return the string of vowels
	}

}
