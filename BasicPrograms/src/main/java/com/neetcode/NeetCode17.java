package com.neetcode;

public class NeetCode17 {

    static int characterReplacement(String s, int k) {
        int maxFreq = 0, maxWin = 0;
        int[] freq = new int[26];

        for (int left = 0, right = 0; right < s.length(); right++) {
            maxFreq = Math.max(maxFreq, ++freq[s.charAt(right) - 'A']);
            while (right - left + 1 - maxFreq > k) {
                freq[s.charAt(left++) - 'A']--;
            }
            maxWin = Math.max(maxWin, right - left + 1);
        }
        return maxWin;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(s, k));
    }
}
