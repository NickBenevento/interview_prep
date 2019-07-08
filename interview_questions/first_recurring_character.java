/* Question: write a function that returns the first reccurring character in a string of letters
 * If there are no repeating characters, the function should return null/none */

import java.util.HashMap;
import java.util.Map;

public class first_recurring_character {

	public static void main(String[] args) {
		String string = "abcdef";
		System.out.print("First recurring character of '" + string + "' is: ");
		System.out.println(first_char(string));
	}

	public static Character first_char(String string) {
		HashMap<Character, Integer> map = new HashMap<>();		 
		for (int i = 0; i < string.length(); i++) {
			char letter = string.charAt(i);
			if (map.containsKey(letter)) {
				return letter;
			}
			map.put(letter, 1);
		}
		return null;
	}
}
