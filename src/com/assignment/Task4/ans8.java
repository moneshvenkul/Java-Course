package com.assignment.Task4;
import java.util.Arrays;
import java.util.Scanner;

public class ans8 {
 public static void main(String[] args) {
         int[] arr = {1, 16, 2, 19, 10, 20};
         Arrays.sort(arr);
         
         System.out.println("Third largest element is: " + arr[arr.length - 3]);
     }
}
