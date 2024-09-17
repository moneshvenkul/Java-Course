package com.assignment.Task2;
import java.util.Scanner;

public class ans8 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your income (in Lakhs): ");
        double income = scanner.nextDouble();
        double tax = 0;
        
        if (income <= 2.5) {
            tax = 0;
        } else if (income <= 6.0) {
            tax = 0.10 * (income - 2.5);
        } else if (income <= 12.0) {
            tax = 0.10 * 3.5 + 0.18 * (income - 6.0);
        } else {
            tax = 0.10 * 3.5 + 0.18 * 6.0 + 0.25 * (income - 12.0);
        }
        
        System.out.println("Total tax: Rs " + tax + " Lakhs");
    }
}
