package practice.algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringReversal {
	private static final String INPUT_WORD = "abcdefghijklmnopqrstuvwxyz";
	private static final String INPUT_SENTENCE = "my name is vivek ranjan sahu and i am not a terrorist";
	public static void main(String[] args) {
		System.out.println(getReversedCharacters(INPUT_WORD));
		System.out.println(getReversedWordsUsingJava7(INPUT_SENTENCE));
		System.out.println(getReversedWordsUsingJava8(INPUT_SENTENCE));
	}
	private static String getReversedCharacters(String input) {
		StringBuilder output = new StringBuilder();
		for (int i = input.length()-1; i > -1; i--) {
			output.append(input.charAt(i));
		}
		return output.toString();
	}
	private static String getReversedWordsUsingJava7(String input) {
		String[] wordsArray = input.split("\\s+");
		List<String> wordsList = Arrays.asList(wordsArray);
		Collections.reverse(wordsList);
		return wordsList.toString();
	}
	private static String getReversedWordsUsingJava8(String input) {
		String[] wordsArray = input.split("\\s+");
		List<String> wordsList = Arrays.asList(wordsArray);
		Collections.reverse(wordsList);
		return wordsList.stream().collect(Collectors.joining(", "));
	}
}
