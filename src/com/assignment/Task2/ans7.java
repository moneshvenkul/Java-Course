package com.assignment.Task2;
import java.util.Scanner;

public class ans7 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            
            if (num < 0) {
                System.out.println("It's Over");
                break;
            } else if (num > 0) {
                System.out.println("Good Going");
                continue;
            }
        }
    }
}
