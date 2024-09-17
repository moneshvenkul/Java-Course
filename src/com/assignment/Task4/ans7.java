package com.assignment.Task4;

public class ans7 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 4, 4, 4, 11, 11, 11};
        int n = arr.length;
        int[] result = new int[n];
        int j = 0;
        
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                result[j++] = arr[i];
            }
        }
        result[j++] = arr[n - 1];
        
        while (j < n) {
            result[j++] = 0;
        }
        
        System.out.println("Resultant array:");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
