package com.programs;

public class SumOfDigit {

    static int sumOfDigit(int num) {
        if (num == 0)
            return 0;
        return sumOfDigit(num / 10) + num % 10;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigit(12345));

    }
}
