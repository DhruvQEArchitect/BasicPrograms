package com.programs;

public class LeetCode367 {

    static boolean isPerfectSquare(int num) {
        if (num < 0) return false;
        if (num == 0 || num == 1) return true;

        long left = 0, right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sq = mid * mid;

            if (sq == num) return true;
            else if (sq < num) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(49));
    }

}
