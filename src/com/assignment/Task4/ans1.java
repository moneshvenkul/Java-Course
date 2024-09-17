package com.assignment.Task4;
import java.util.Scanner;

public class ans1 {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter the size of the array: ");
           int n = scanner.nextInt();
           
           int[] arr = new int[n];
           System.out.println("Enter " + n + " elements:");
           for (int i = 0; i < n; i++) {
               arr[i] = scanner.nextInt();
           }
           
           System.out.println("Array elements are:");
           for (int i = 0; i < n; i++) {
               System.out.print(arr[i] + " ");
           }
       }
}
