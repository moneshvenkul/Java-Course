package com.assignment.Task4;
import java.util.Scanner;
import java.util.Arrays;

public class ans10 {
public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        
        boolean isEqual = Arrays.equals(arr1, arr2);
        
        if (isEqual) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }
    }
}
