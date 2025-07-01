package com.programs;

public class LeetCode213 {

    static int rob(int[] nums) {
        if (nums.length == 1) return nums[0];

        int[] first = new int[nums.length - 1];
        int[] second = new int[nums.length - 1];

        for (int i = 0; i < nums.length - 1; i++) {
            first[i] = nums[i];
            second[i] = nums[i + 1];
        }

        int firstMax = getMax(first);
        int secondMax = getMax(second);
        return Math.max(firstMax, secondMax);
    }

    static int getMax(int[] arr) {
        int[] dp = new int[arr.length];

        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            dp[i] = Math.max(dp[i - 2] + arr[i], dp[i - 1]);
        }

        return dp[arr.length - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(rob(arr));
    }
}
