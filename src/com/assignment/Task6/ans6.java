package com.assignment.Task6;
import java.util.HashMap;
import java.util.Scanner;

public class ans6 {
   public static void main(String[] args) {
        String str = "programming";
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        
        System.out.println("Character occurrences:");
        for (HashMap.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
