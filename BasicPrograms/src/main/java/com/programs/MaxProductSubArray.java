package com.programs;

public class MaxProductSubArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, -4, 6, 3, 5};
        int leftProduct = 1, rightProduct = 1;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            leftProduct = leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1 : rightProduct;
            leftProduct *= arr[i];
            rightProduct *= arr[arr.length - 1 - i];
            res = Math.max(res, Math.max(leftProduct, rightProduct));
        }
        System.out.println(res);
    }
}
