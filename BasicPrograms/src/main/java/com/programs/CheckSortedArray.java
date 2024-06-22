package com.programs;

/**
 * Program to check if any given array is sorted or not
 */
public class CheckSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 25, 6};
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            if (j == arr.length) {
                break;
            } else if (arr[i] < arr[j]) {
                ++j;
            } else {
                System.out.println("Array not sorted");
                System.exit(0);
            }
        }
        System.out.println("Array is sorted");
    }
}
