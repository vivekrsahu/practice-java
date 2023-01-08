package practice.corejava.java8.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

    public static void main(String[] args) {
        printDuplicates(List.of(1, 7, 4, 6, 8, 2, 8, 3, 6));
    }

    private static void printDuplicates(List<Integer> inputList) {
        Set<Integer> outputSet = new HashSet<>();
        inputList.stream().filter(item -> !outputSet.add(item)).forEach(System.out::println);
    }

}
