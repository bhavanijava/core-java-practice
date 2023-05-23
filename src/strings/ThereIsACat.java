package strings;

public class ThereIsACat {

	public static void main(String[] args)
	{
//		String str = "there is a cat";
//
//		// Split the string into words
//		String[] words = str.split(" ");
//
//		// Create a new string with the last word first
//		String newStr = words[words.length - 1];
//
//		// Add the remaining words in reverse order
//		for (int i = words.length - 2; i >= 0; i--) {
//		    newStr += " " + words[i];
//		}
//
//		System.out.println(newStr); // Output: cat is there
		
		
		String str = "there is a cat";

		// Split the string into words
		String[] words = str.split(" ");

		// Create a new string with the last word first
		String newStr = words[words.length - 1];

		// Add the remaining words in reverse order, but skip any word that contains "a"
		for (int i = words.length - 2; i >= 0; i--) {
		    if (!words[i].contains("a")) {
		        newStr += " " + words[i];
		    }
		}

		System.out.println(newStr); // Output: cat is there

	}
	
	
}
