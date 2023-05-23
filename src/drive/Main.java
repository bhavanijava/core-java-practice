package drive;

import java.util.*; 
import java.io.*;

class Main {

  public static String KUniqueCharacters(String str) {
    int k = Character.getNumericValue(str.charAt(0));
    str = str.substring(1);
    int n = str.length();
    int start = 0;
    int end = 0;
    int maxLength = 0;
    Map<Character, Integer> freq = new HashMap<>();

    while (end < n) {
      char c = str.charAt(end);
      freq.put(c, freq.getOrDefault(c, 0) + 1);
      end++;

      while (freq.size() > k) {
        char d = str.charAt(start);
        freq.put(d, freq.get(d) - 1);
        if (freq.get(d) == 0) {
          freq.remove(d);
        }
        start++;
      }

      if (freq.size() == k) {
        maxLength = Math.max(maxLength, end - start);
      }
    }

    return str.substring(start, start + maxLength);
  }

  public static void main (String[] args) {  
    Scanner s = new Scanner(System.in);
    System.out.print(KUniqueCharacters(s.nextLine())); 
  }

}
