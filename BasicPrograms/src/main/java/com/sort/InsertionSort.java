package com.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 4, 3, 6, 9, 8, 7};
        for (int j = 1; j < arr.length; j++) {
            int i = j - 1;
            int key = arr[j];
            while (i >= 0 && key < arr[i]) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = key;
        }
        System.out.println("After insertion sort");
        System.out.println(Arrays.toString(arr));

    }
}
