package practice.corejava.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RepeatedCharacterSorting {

	private static Map<Character, Integer> findCharacterCount(char[] inputArr) {
		return evaluateCount(inputArr, new HashMap<>());
	}

	private static Map<Character, Integer> findCharacterCountSequenced(char[] inputArr) {
		return evaluateCount(inputArr, new LinkedHashMap<>());
	}

	private static Map<Character, Integer> evaluateCount(char[] inputArr, Map<Character, Integer> characterCountMap) {
		Stream<Character> charStream = IntStream.range(0, inputArr.length).mapToObj(i -> inputArr[i]);
		charStream.forEach((character) -> {
			if (!characterCountMap.containsKey(character)) {
				characterCountMap.put(character, 1);
			} else {
				characterCountMap.put(character, characterCountMap.get(character) + 1);
			}
		});
		return characterCountMap;
	}

	private static List<Character> sortFinalList(char[] charArr, Map<Character, Integer> charCountMap) {
		List<Character> sortedList = new ArrayList<>();
		int maxRepetition = charCountMap.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getValue();
		for (int currentRepetition = 1; currentRepetition <= maxRepetition; currentRepetition++) {
			repeater(sortedList, charArr, charCountMap, currentRepetition);
		}
		return sortedList;
	}

	private static void repeater(List<Character> sortedList, char[] charArr, Map<Character, Integer> charCountMap, int currentRepetition) {
		for (int i = 0; i < charArr.length; i++) {
			if (charCountMap.get(charArr[i]) == currentRepetition && !sortedList.contains(charArr[i])) {
				addCharacterToList(sortedList, charArr[i], currentRepetition);
			}
		}
	}

	private static void addCharacterToList(List<Character> sortedList, char currentChar, int currentRepetition) {
		for (int j = 0; j < currentRepetition; j++) {
			sortedList.add(currentChar);
		}
	}

	private static String getSortedCharactersWithCount(char[] charArr, Map<Character, Integer> charCountMap) {
		Set<String> set = new LinkedHashSet<>();
		int maxRepetition = charCountMap.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getValue();
		for (int currentRepetition = 1; currentRepetition <= maxRepetition; currentRepetition++) {
			repeaterAdd(charArr, charCountMap, set, currentRepetition);
		}
		return set.toString();
	}

	private static void repeaterAdd(char[] charArr, Map<Character, Integer> charCountMap, Set<String> set, int currentRepetition) {
		for (int i = 0; i < charArr.length; i++) {
			if (charCountMap.get(charArr[i]) == currentRepetition) {
				set.add(charArr[i] + "" + currentRepetition);
			}
		}
	}

	public static void main(String[] args) {
		char[] inputArr = {'a','b','f','b','d','b','f','c','b','k','k','a'};
		char[] input2Arr = "bbaaaddeeeff".toCharArray();
		System.out.println(sortFinalList(inputArr, findCharacterCount(inputArr)));
		System.out.println(getSortedCharactersWithCount(input2Arr, findCharacterCountSequenced(input2Arr)));
	}

}
