package com.assignment.Task6;
import java.util.Scanner;

public class ans9 {
    public static void main(String[] args) {
        String str = "ABC";
        generateCombinations("", str);
    }

    private static void generateCombinations(String prefix, String str) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                generateCombinations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1));
            }
        }
    }
}
