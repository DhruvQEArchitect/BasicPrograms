package com.neetcode;

import java.util.Arrays;

public class NeetCode15 {

    public static int maxProfit(int[] prices) {
        int max = 0;
        int[] aux = new int[prices.length];
        aux[prices.length - 1] = prices[prices.length - 1];
        for (int i = prices.length - 1; i > 0; i--) {
            aux[i - 1] = Math.max(prices[i - 1], aux[i]);

        }
        for (int k = 0; k < prices.length; k++) {
            max = Math.max(aux[k] - prices[k], max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = {10, 8, 7, 5, 2};
        System.out.println(maxProfit(prices));
    }
}
