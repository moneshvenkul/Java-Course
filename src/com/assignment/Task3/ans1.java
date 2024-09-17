package com.assignment.Task3;
import java.util.Scanner;

public class ans1 {
   public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter the number of terms: ");
           int n = scanner.nextInt();
           
           int a = 0, b = 1;
           System.out.print("Fibonacci Series: " + a + ", " + b);
           
           for (int i = 2; i < n; i++) {
               int next = a + b;
               System.out.print(", " + next);
               a = b;
               b = next;
           }
       }
}
