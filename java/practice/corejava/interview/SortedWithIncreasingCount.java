package practice.corejava.interview;

import java.util.*;

public class SortedWithIncreasingCount {
    public static void main(String[] args) {
        String input = "badcheajccb";
        printSortedWithIncreasingCount(input);
    }

    private static void printSortedWithIncreasingCount(String input) {
        Map<Character, Integer> countMap = new LinkedHashMap<>(input.length());
        populateCountMap(countMap, input);

        Set<Map.Entry<Character, Integer>> set = countMap.entrySet();
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(set);
        list.sort(Map.Entry.comparingByValue());

        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            stringBuilder.append(String.valueOf(entry.getKey()).repeat(Math.max(0, entry.getValue())));
        }

        System.out.println(stringBuilder);
    }

    private static void populateCountMap(Map<Character, Integer> countMap, String input) {
        List<Character> list = input.chars().mapToObj(c -> (char) c).toList();
        for (int i = 0; i < list.size(); i++) {
            int count = Collections.frequency(list, list.get(i));
            countMap.put(list.get(i), count);
        }
    }

}
