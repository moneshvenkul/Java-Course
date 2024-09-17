package com.assignment.Task5;
import java.util.Scanner;

public class Employee {
    String name;
    int yearOfJoining;
    String address;

    // Constructor to initialize employee details
    Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.printf("%-10s %-15s %s%n", name, yearOfJoining, address);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Robert", 1994, "64C- Walls Street");
        Employee emp2 = new Employee("Sam", 2000, "68D- Walls Street");
        Employee emp3 = new Employee("John", 1999, "26B- Walls Street");

        System.out.printf("%-10s %-15s %s%n", "Name", "Year of Joining", "Address");
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}
