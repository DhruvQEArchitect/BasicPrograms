package com.programs;

public class Sum_Two_Integers {

    public int getSum(int a, int b) {
        //first approach using while loop
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;

        //another approach using recursion
//        if (b == 0) return a;
//        return getSum(a ^ b, (a & b) << 1);
    }
}
