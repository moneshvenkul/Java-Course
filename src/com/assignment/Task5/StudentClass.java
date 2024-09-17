package com.assignment.Task5;
import java.util.Scanner;
import java.util.Arrays;

class StudentClass {
    String name;

    // Constructor when no name is passed
    StudentClass() {
        this.name = "Unknown";
    }

    // Constructor when name is passed
    StudentClass(String name) {
        this.name = name;
    }

    // Method to display StudentClass name
    void displayName() {
        System.out.println("StudentClass name: " + name);
    }

    public static void main(String[] args) {
        StudentClass StudentClass1 = new StudentClass();  // No name passed
        StudentClass StudentClass2 = new StudentClass("John");  // Name passed

        StudentClass1.displayName();
        StudentClass2.displayName();
    }
}
