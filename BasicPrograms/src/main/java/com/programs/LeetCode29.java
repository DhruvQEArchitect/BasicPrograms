package com.programs;

public class LeetCode29 {

    static int divide(int dividend, int divisor) {
        if (dividend == divisor) return 1;
        if (dividend == Integer.MIN_VALUE && divisor == 1)
            return Integer.MAX_VALUE;

        boolean sign = true;
        if (dividend < 0 && divisor > 0) sign = false;
        if (dividend >= 0 && divisor < 0) sign = false;

        long ans = 0;
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        int count = 0;
        while (n >= d) {
            count = 0;
            while (n > d << (count + 1)) {
                count++;
            }
            ans += 1 << count;
            n = n - d * (1 << count);
            if (ans >= Math.pow(2, 31) && sign) return Integer.MAX_VALUE;

            if (ans >= Math.pow(2, 31) && !sign) return Integer.MIN_VALUE;
        }
        return sign ? (int) ans : (int) -ans;
    }
}
