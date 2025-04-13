package com.programs;

public class StockBuyAndSell {

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int[] aux = new int[n];
        aux[n - 1] = prices[n - 1];

        for (int i = n - 1; i > 0; i--) {
            aux[i - 1] = Math.max(prices[i - 1], aux[i]);
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(aux[i] - prices[i], max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr));
    }
}
