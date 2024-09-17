package com.assignment.Task6;
import java.util.Scanner;
import java.util.HashSet;

public class ans3 {
public static void main(String[] args) {
        String str = "hello";
        boolean hasUniqueChars = true;
        
        HashSet<Character> charSet = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!charSet.add(c)) {
                hasUniqueChars = false;
                break;
            }
        }
        
        if (hasUniqueChars) {
            System.out.println("The string has all unique characters.");
        } else {
            System.out.println("The string does not have all unique characters.");
        }
    }
}
