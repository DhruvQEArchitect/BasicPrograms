package com.programs;

public class LC69 {

    static int mySqrt(int x) {
        int left = 0, right = x, result = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (Math.pow(mid, 2) > x)
                right = mid - 1;
            else if (Math.pow(mid, 2) < x) {
                left = mid + 1;
                result = mid;
            } else return mid;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
}
