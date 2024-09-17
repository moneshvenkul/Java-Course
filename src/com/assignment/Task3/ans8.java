package com.assignment.Task3;
import java.util.Scanner;

public class ans8 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        int num, largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        
        do {
            System.out.print("Enter a number: ");
            num = scanner.nextInt();
            
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
            
            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);
            
        } while (choice == 'y' || choice == 'Y');
        
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}
