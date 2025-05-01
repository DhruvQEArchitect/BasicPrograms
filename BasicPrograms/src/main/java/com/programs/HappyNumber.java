package com.programs;

import java.util.HashSet;

public class HappyNumber {

    static boolean isHappy(int n) {
        HashSet<Integer> hashSet = new HashSet<>();

        while (true) {
            int sum = 0;
            while (n != 0) {
                sum += Math.pow(n % 10, 2);
                n = n / 10;
            }
            if (sum == 1) return true;
            n = sum;
            if (hashSet.contains(n))
                return false;
            hashSet.add(n);
        }
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
