package strings;

import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class HighestOccuranceUsingStreamApi {
	public static void main(String[] args) {
		String input = "acvffdddaavcccggggggggg";

		// Create a Map to store the count of each character in the input string
		Map<Character, Integer> charCount = input.chars()
		        .mapToObj(c -> (char) c)
		        .collect(Collectors.toMap(c -> c, c -> 1, Integer::sum));

		// Find the character with the highest count using the Map entrySet and stream functions
		Entry<Character, Integer> maxEntry = charCount.entrySet()
		        .stream()
		        .max(Map.Entry.comparingByValue())
		        .get();

		System.out.println("The highest occurring character in the input string is: " + maxEntry.getKey()+" Count is "+maxEntry.getValue());
	}
}



