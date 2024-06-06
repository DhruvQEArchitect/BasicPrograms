package com.programs;

import java.util.Arrays;

public class ShiftZeroesToRight {

    static int[] shiftZeroes(int[] arr) {
        int nz = 0, z = 0;
        while (nz < arr.length) {
            if (arr[nz] != 0) {
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                z++;
            } else {
                nz++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 7, 6, 0, 0, 4};
        System.out.println(Arrays.toString(shiftZeroes(arr)));
    }
}
