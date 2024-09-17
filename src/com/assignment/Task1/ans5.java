package com.assignment.Task1;

import java.util.Scanner;

public class ans5 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        double area = 3.14 * radius * radius;  // Area formula
        System.out.println("The area of the circle is: " + area);
    }
}
