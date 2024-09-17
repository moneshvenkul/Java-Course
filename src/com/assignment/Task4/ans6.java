package com.assignment.Task4;
import java.util.Scanner;

public class ans6 {
  public static void main(String[] args) {
         int[] arr = {1, 2, 4, 5, 6};
         int target = 6;
         
         for (int i = 0; i < arr.length - 1; i++) {
             for (int j = i + 1; j < arr.length; j++) {
                 if (arr[i] + arr[j] == target) {
                     System.out.println("Pair found: " + arr[i] + ", " + arr[j]);
                 }
             }
         }
     }
}
