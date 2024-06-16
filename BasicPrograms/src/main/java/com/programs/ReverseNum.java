package com.programs;

public class ReverseNum {

    static void reverseNum(int num) {
        if (num < 10) {
            System.out.print(num);
            return;
        } else {
            System.out.print(num % 10);
            reverseNum(num / 10);
        }
    }

    public static void main(String[] args) {
        int num = 1234;
        reverseNum(num);
    }
}
