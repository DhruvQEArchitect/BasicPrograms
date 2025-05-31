package com.programs;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LongestSubString {

    static int lengthOfLongestSubstring(String s) {
        char[] ch = s.toCharArray();
        HashSet<Character> hashSet = new HashSet<>();
        int maxLength = 0, left = 0;
        for (int right = 0; right < s.length(); right++) {
            while (hashSet.contains(ch[right])) {
                hashSet.remove(ch[left]);
                left++;
            }
            hashSet.add(ch[right]);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
