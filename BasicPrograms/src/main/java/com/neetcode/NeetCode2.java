package com.neetcode;

//Valid Anagram

public class NeetCode2 {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[ch1[i] - 'a']++;
            freq[ch2[i] - 'a']--;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "jar", t = "jam";
        System.out.println(isAnagram(s, t));
    }
}
