package com.sort;

import java.util.Arrays;

public class MergeSort {

    static void sort(int p, int q, int r, int[] arr) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < L.length; i++) {
            L[i] = arr[p + i];
        }

        for (int j = 0; j < R.length; j++) {
            R[j] = arr[q + j + 1];
        }

        int i = 0, j = 0, k = p;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    static void merge(int p, int r, int[] arr) {
        if (p < r) {
            int q = (p + r) / 2;
            merge(p, q, arr);
            merge(q + 1, r, arr);
            sort(p, q, r, arr);
        }
    }


    public static void main(String[] args) {

        int[] arr = {11, 12, 13, 1, 2, 3};
        merge(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));
    }

}
