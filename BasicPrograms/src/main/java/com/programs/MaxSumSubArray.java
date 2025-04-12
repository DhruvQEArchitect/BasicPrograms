package com.programs;

public class MaxSumSubArray {

    static int maxSumSubArray(int[] arr) {
        int curSum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];
            maxSum = Math.max(curSum, maxSum);
            if (curSum < 0) {
                curSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {5, -4, -2, 6, -1};
        System.out.println(maxSumSubArray(arr));
    }
}
