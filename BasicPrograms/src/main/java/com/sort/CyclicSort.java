package com.sort;

import java.util.Arrays;

public class CyclicSort {

    /**
     * to sort the numbers from 0 to n
     *
     * @param arr
     */
    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] != arr[correctIndex]) {
                swap(i, correctIndex, arr);
            } else {
                i++;
            }
        }

    }

    /**
     * method to swap the values
     *
     * @param first
     * @param second
     * @param arr
     */
    static void swap(int first, int second, int[] arr) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 7, 6, 0, 5};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
