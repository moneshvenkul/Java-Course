package com.assignment.Task3;
import java.util.Scanner;

public class ans5 {
  public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the value of n: ");
         int n = scanner.nextInt();
         
         int sum = 0, count = 0, number = 2;
         
         while (count < n) {
             sum += number;
             number += 2;
             count++;
         }
         
         System.out.println("Sum of first " + n + " even numbers is: " + sum);
     }
}
