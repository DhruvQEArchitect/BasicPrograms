package com.programs;

public class LeetCode1446 {

    static int maxPower(String s) {
        char[] ch = s.toCharArray();
        int count = 1, max = 1;
        for (int i = 1; i < s.length(); i++) {
            if (ch[i - 1] == ch[i]) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
            }
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
