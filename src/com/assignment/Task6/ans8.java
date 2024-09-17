package com.assignment.Task6;
import java.util.Arrays;
import java.util.Scanner;

public class ans8 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 0, 5, 9};
        int max = arr[0];
        
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        
        System.out.println("Maximum value in the array: " + max);
    }
}
