package com.assignment.Task4;
import java.util.Scanner;

public class ans9 {
  public static void main(String[] args) {
         int[] nums = {1, 4, 10, -3};
         int target = 14;
         
         for (int i = 0; i < nums.length - 1; i++) {
             for (int j = i + 1; j < nums.length; j++) {
                 if (nums[i] + nums[j] == target) {
                     System.out.println("Indices: [" + i + ", " + j + "]");
                     return;
                 }
             }
         }
     }
}
