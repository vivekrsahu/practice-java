package practice.corejava.interview;

import java.util.*;

public class PrintUniqueWords {

    public static void main(String[] args) {
        String input1 = "This apple is sweet";
        String input2 = "This apple is sour";
        printUniqueWords(input1, input2);
    }

    private static void printUniqueWords(String input1, String input2) {
        List<String> mergedList = new ArrayList<>(Arrays.asList(input1.split(" ")));
        mergedList.addAll(Arrays.asList(input2.split(" ")));

        Map<String, Integer> countMap = new HashMap<>();
        for (int i = 0; i < mergedList.size(); i++) {
            int count = Collections.frequency(mergedList, mergedList.get(i));
            countMap.put(mergedList.get(i), count);
        }

        countMap.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).forEach(System.out::println);
    }

}
