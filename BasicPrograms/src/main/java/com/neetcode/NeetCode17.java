package com.neetcode;

public class NeetCode17 {

    static int characterReplacement(String s, int k) {
        int left = 0, maxFreq = 0, winSize = 0, maxWin = 0;
        int[] freq = new int[26];

        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'A']++;

            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            winSize = right - left + 1;
            if (winSize - maxFreq > k) {
                freq[s.charAt(right) - 'A']--;
                left++;
            }
            winSize = right - left + 1;
            maxWin = Math.max(maxWin, winSize);
        }
        return maxWin;
    }

    public static void main(String[] args) {
        String s = "XYYX";
        int k = 2;
        System.out.println(characterReplacement(s, k));
    }
}
