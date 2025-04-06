package com.neetcode;

//Products of Array Except Self

import java.util.Arrays;

public class NeetCode7 {

    public static int[] productExceptSelf(int[] nums) {
        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];

        leftProduct[0] = 1;
        for (int i = 1; i < leftProduct.length; i++) {
            leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
        }

        rightProduct[rightProduct.length - 1] = 1;
        for (int j = rightProduct.length - 2; j >= 0; j--) {
            rightProduct[j] = rightProduct[j + 1] * nums[j + 1];
        }

        for (int k = 0; k < nums.length; k++) {
            nums[k] = leftProduct[k] * rightProduct[k];
        }
        return nums;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
