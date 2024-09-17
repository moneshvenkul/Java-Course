package com.assignment.Task2;
import java.util.Scanner;

public class ans5 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter percentage: ");
        double percentage = scanner.nextDouble();

        if (percentage > 90) {
            System.out.println("Grade: A");
        } else if (percentage > 75) {
            System.out.println("Grade: B");
        } else if (percentage > 65) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
    }
}
