package com.assignment.Task4;
import java.util.Scanner;

public class ans3 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();
        
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("The number is present in the array.");
        } else {
            System.out.println("The number is not present in the array.");
        }
    }
}
