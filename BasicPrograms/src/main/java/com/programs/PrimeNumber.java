package com.programs;

public class PrimeNumber {

    public static void main(String[] args) {
        int num = 32;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println("not a prime number");
                System.exit(0);
            }
        }
        System.out.println("prime number");
    }
}
