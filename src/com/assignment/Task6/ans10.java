package com.assignment.Task6;
import java.util.*;

public class ans10 {
public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 40);
        map.put("Orange", 20);
        map.put("Banana", 50);
        map.put("Grapes", 30);

        // Sort by keys
        TreeMap<String, Integer> sortedByKey = new TreeMap<>(map);
        System.out.println("Sorted by keys: " + sortedByKey);

        // Sort by values
        List<Map.Entry<String, Integer>> sortedByValue = new ArrayList<>(map.entrySet());
        sortedByValue.sort(Map.Entry.comparingByValue());
        System.out.println("Sorted by values: " + sortedByValue);
    }
}
