package practice.corejava.interview;

import java.util.HashMap;
import java.util.Map;

public class SortHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("ABC", "XYZ");
        map.put("ACD", "ABD");
        map.put("PQR", "DEF");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}
