package com.programs;

public class LeetCode191 {

    static int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            if (n % 2 == 1)
                res++;
            n = n >> 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(128));
    }
}
