package com.programs;

public class CountZeroes {

    static int countZeroes(int num, int count) {
        if (num == 0) return count;
        if (num % 10 == 0) return countZeroes(num / 10, count + 1);
        return countZeroes(num / 10, count);
    }

    public static void main(String[] args) {
        int num = 201103405;
        System.out.println(countZeroes(num, 0));
    }
}
