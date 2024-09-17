package com.assignment.Task5;
import java.util.Scanner;

public class Student {
    String name;
       int EnrollmentNo;
   
       // Constructor to initialize the values
       Student(String name, int EnrollmentNo) {
           this.name = name;
           this.EnrollmentNo = EnrollmentNo;
       }
   
       // Method to display student details
       void displayDetails() {
           System.out.println("Name: " + name);
           System.out.println("Enrollment No: " + EnrollmentNo);
       }
   
       public static void main(String[] args) {
           Student amay = new Student("Amay", 132);  // Creating an object
           amay.displayDetails();  // Printing details
       }
}
