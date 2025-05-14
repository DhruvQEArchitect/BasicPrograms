package com.programs;

public class LeetCode338 {

    static int[] countBits(int n) {
        int offset = 1;
        int[] dp = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            if (offset * 2 == i)
                offset = i;
            dp[i] = 1 + dp[i - offset];
        }
        return dp;
    }

}
