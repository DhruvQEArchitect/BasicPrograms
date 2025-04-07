package com.neetcode;

import java.util.HashSet;

public class NeetCode16 {

    public static int lengthOfLongestSubstring(String s) {
        char[] ch = s.toCharArray();
        int left = 0,  maxLen = 0;
        HashSet<Character> hashSet = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (hashSet.contains(ch[right])) {
                hashSet.remove(ch[left]);
                left++;
            }
            hashSet.add(ch[right]);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
