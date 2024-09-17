package com.assignment.Task5;
import java.util.Scanner;

class Triangle {
    int side1, side2, side3;

    // Constructor to initialize the sides of the triangle
    Triangle() {
        side1 = 3;
        side2 = 4;
        side3 = 5;
    }

    // Method to calculate area using Heron's formula
    double calculateArea() {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Method to calculate the perimeter
    int calculatePerimeter() {
        return side1 + side2 + side3;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();  // Creating an object
        System.out.println("Area of the triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of the triangle: " + triangle.calculatePerimeter());
    }
}
