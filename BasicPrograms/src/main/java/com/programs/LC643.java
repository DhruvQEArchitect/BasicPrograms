package com.programs;

public class LC643 {

    static double findMaxAverage(int[] arr, int k) {
        if (arr.length == 1) return arr[0];
        double maxAverage = Integer.MIN_VALUE, currSum = 0;
        for (int i = 0; i < k; i++) {
            currSum += arr[i];
        }
        maxAverage = currSum / k;

        for (int i = k; i < arr.length; i++) {
            currSum += arr[i] - arr[i - k];
            maxAverage = Math.max(maxAverage, currSum / k);
        }
        return maxAverage;
    }

    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(findMaxAverage(arr, k));
    }
}
