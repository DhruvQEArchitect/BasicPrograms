package com.programs;

public class LongestPalindromicSubstring {

    static String longestPalindrome(String s) {
        String res = "";
        //for odd length
        for (int ax = 0; ax < s.length(); ax++) {
            int orbit = 1, len = 1;
            while (ax - orbit >= 0 && ax + orbit < s.length()) {
                if (s.charAt(ax - orbit) == s.charAt(ax + orbit)) {
                    orbit++;
                    len += 2;
                } else break;
            }
            if (len > res.length()) {
                int si = ax - len / 2;
                res = s.substring(si, si + len);
            }
        }

        //for even length
        for (int ax = 0; ax < s.length() - 1; ax++) {
            int orbit = 1, len = 0;
            while (ax - orbit + 1 >= 0 && ax + orbit < s.length()) {
                if (s.charAt(ax - orbit + 1) == s.charAt(ax + orbit)) {
                    orbit++;
                    len += 2;
                } else break;
            }
            if (len > res.length()) {
                int si = ax - len / 2 + 1;
                res = s.substring(si, si + len);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String string = "cbbd";
        System.out.println(longestPalindrome(string));
    }
}
