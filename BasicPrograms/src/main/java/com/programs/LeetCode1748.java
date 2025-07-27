package com.programs;


public class LeetCode1748 {

    static int sumOfUnique(int[] arr) {
        int sum = 0;
        int[] freq = new int[101];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i] - 0]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        System.out.println(sumOfUnique(arr));
    }
}
