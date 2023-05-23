package strings;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "prepinsta";
	        String s1 = "";
	        s1 = s.replaceAll("[aeiou]", ""); 
	        System.out.println("String after removing vowel : "+s1);
	}

}
