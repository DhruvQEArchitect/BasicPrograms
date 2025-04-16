package com.programs;


public class FindTheDifference {

    public static char findTheDifference(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ++freq[ch1[i] - 'a'];
        }

        for (int j = 0; j < t.length(); j++) {
            if (--freq[ch2[j] - 'a'] < 0)
                return ch2[j];
        }
        return '0';
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";

        System.out.println(findTheDifference(s, t));
    }
}
