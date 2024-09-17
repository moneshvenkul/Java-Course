package com.assignment.Task6;
import java.util.ArrayList;
import java.util.List;
public class ans11 {
public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int targetSum = 12;
        
        List<int[]> subarrays = findSubarrays(arr, targetSum);
        System.out.println("Subarrays with the sum " + targetSum + ":");
        for (int[] subarray : subarrays) {
            for (int num : subarray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static List<int[]> findSubarrays(int[] arr, int targetSum) {
        List<int[]> result = new ArrayList<>();
        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];
                if (sum == targetSum) {
                    int[] subarray = new int[end - start + 1];
                    System.arraycopy(arr, start, subarray, 0, end - start + 1);
                    result.add(subarray);
                }
            }
        }
        return result;
    }
}
