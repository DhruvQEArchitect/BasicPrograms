package com.programs;

public class SumOfDigit {

    static int sumOfDigit(int num) {
        if (num == 0)
            return 0;
        return sumOfDigit(num / 10) + num % 10;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigit(12345));
        System.out.println(getSum(1234));

    }

    static int getSum(int num) {
        int sum = 0;
        while (num % 10 != 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}
