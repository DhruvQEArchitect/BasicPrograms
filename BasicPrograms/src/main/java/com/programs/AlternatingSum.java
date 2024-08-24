package com.programs;

public class AlternatingSum {

    public static int getAlternatingSum(int num) {
        int sum = 0, sign = 1;
        for (int c : String.valueOf(num).toCharArray()) {
            int ch = c - '0';
            sum += sign * ch;
            sign *= -1;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 521;
        System.out.println(getAlternatingSum(num));
    }
}
