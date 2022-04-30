package practice.corejava.algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * This class provides a counter of repeated characters in an input String.
 * @author Vivek Ranjan Sahu
 */
public final class CharacterRepeatCounter {
	public static void main(String[] args) {
		System.out.println(printRepeatedCharactersCount("my name is vivek ranjan sahu and i am not a teacher"));
	}
	private static String printRepeatedCharactersCount(String input) {
		StringBuilder output = new StringBuilder();
		Set<Character> set = new HashSet<>();
		int counter = 0;
		char character;
		String statement = "Count of '%s' = %s\n";
		for (int i = 0; i < input.length(); i++) {
			character = input.charAt(i);
			if (set.add(character)) {
				for (int j = 0; j < input.length(); j++) {
					if (character == input.charAt(j)) {
						counter++;
					}
				}
				if (counter > 1) {
					output.append(String.format(statement, character, counter));
				}
				counter = 0;
			}
		}
		return output.toString();
	}
}
