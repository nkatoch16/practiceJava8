package com.learnjava.practice;

import java.util.Arrays;

public class BinarySearchDSA {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 3, 78, 34, 243, 23, 22 ,45, 66};
        Arrays.sort(arr);
        System.out.println(arr);
        int x = 34;
        int result = BinarySearchDSA.find(arr,x);
        System.out.println("Index : "+result);
    }

    private static int find(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if x is present at mid
            if (arr[mid] == x)
                return mid;

            // If x greater, ignore left half
            if (arr[mid] < x)
                low = mid + 1;

                // If x is smaller, ignore right half
            else
                high = mid - 1;
        }

        // If we reach here, then element was
        // not present
        return -1;
    }
}
