package com.assignment.Task2;
import java.util.Scanner;

public class ans10 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();
        
        double HRA, DA, grossSalary;
        
        if (basicSalary <= 15000) {
            HRA = 0.25 * basicSalary;
            DA = 0.82 * basicSalary;
        } else if (basicSalary <= 20200) {
            HRA = 0.27 * basicSalary;
            DA = 0.90 * basicSalary;
        } else {
            HRA = 0.36 * basicSalary;
            DA = 0.95 * basicSalary;
        }
        
        grossSalary = basicSalary + HRA + DA;
        System.out.println("Gross Salary: Rs " + grossSalary);
    }
}
