package com.programs;

public class LeetCode7 {

    static int reverse(int num) {
        int rev = 0;
        do {
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10)
                return 0;
            rev = rev * 10 + num % 10;
            num = num / 10;
        } while (num != 0);
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

}
