package com.programs;

public class PalindromeNumber {

    public static void main(String[] args) {
        int num = 1212;
        int temp = num;
        int digit, rev = 0;
        do {
            digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        } while (num != 0);
        if (temp == rev)
            System.out.println("palindrome number");
        else System.out.println("not a palindrome number");
    }
}
