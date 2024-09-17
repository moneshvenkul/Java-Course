package com.assignment.Task6;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;
public class ans1 {
    public static void main(String[] args) {
        String str = "programming";
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeated character: " + entry.getKey());
                break;
            }
        }
    }
}
