package com.programs;

import java.util.Arrays;

public class ShiftZeroesToRight {

    static int[] shiftZeroes(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(i, count, arr);
                count++;
            }
        }
        return arr;
    }

    static void swap(int first, int last, int[] arr) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 7, 6, 0, 0, 4};
        System.out.println(Arrays.toString(shiftZeroes(arr)));
    }
}
