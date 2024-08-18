package com.programs;

import java.util.Arrays;

public class ProductExceptSelf {

    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        int[] prefix = new int[arr.length];
        int[] suffix = new int[arr.length];
        prefix[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] * arr[i - 1];
        }
        suffix[suffix.length - 1] = 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * arr[i + 1];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = prefix[i] * suffix[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
