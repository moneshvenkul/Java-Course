package com.assignment.Task2;
import java.util.Scanner;

public class ans9 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();
        double bill = 0;
        
        if (units <= 60) {
            bill = units * 0.30;
        } else if (units <= 150) {
            bill = 60 * 0.30 + (units - 60) * 0.75;
        } else if (units <= 270) {
            bill = 60 * 0.30 + 90 * 0.75 + (units - 150) * 1.10;
        } else {
            bill = 60 * 0.30 + 90 * 0.75 + 120 * 1.10 + (units - 270) * 2.50;
        }
        
        bill += 0.20 * bill;  // Additional surcharge of 20%
        
        System.out.println("Total electricity bill: Rs " + bill);
    }
}
