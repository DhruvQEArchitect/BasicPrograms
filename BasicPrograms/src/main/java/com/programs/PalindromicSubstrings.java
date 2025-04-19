package com.programs;

public class PalindromicSubstrings {

    static int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += countPalindromes(s, i, i);
            count += countPalindromes(s, i, i + 1);
        }
        return count;
    }

    static int countPalindromes(String string, int left, int right) {
        int count = 0;
        while (left >= 0 && right < string.length() && string.charAt(left) == string.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("aaa"));
    }
}
