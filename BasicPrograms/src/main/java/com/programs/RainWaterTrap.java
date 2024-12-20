package com.programs;

public class RainWaterTrap {

    static int rainWaterTrap(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int ans = 0;

        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }
        right[n - 1] = arr[n - 1];

        for (int j = n - 2; j >= 0; j--) {
            right[j] = Math.max(right[j + 1], arr[j]);
        }

        for (int k = 0; k < n; k++) {
            ans += Math.min(left[k], right[k]) - arr[k];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 0, 4, 0, 2};
        System.out.println(rainWaterTrap(arr));
    }

}
