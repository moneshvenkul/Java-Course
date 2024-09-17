package com.assignment.Task5;
import java.util.Scanner;

public class Rectangle {
    int length, breadth;

    // Constructor with no parameter
    Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    // Constructor with two parameters
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Constructor with one parameter
    Rectangle(int side) {
        this.length = side;
        this.breadth = side;
    }

    // Method to calculate area
    int calculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();  // No parameter
        Rectangle rect2 = new Rectangle(5, 10);  // Two parameters
        Rectangle rect3 = new Rectangle(7);  // One parameter

        System.out.println("Area of rectangle 1: " + rect1.calculateArea());
        System.out.println("Area of rectangle 2: " + rect2.calculateArea());
        System.out.println("Area of rectangle 3: " + rect3.calculateArea());
    }
}
