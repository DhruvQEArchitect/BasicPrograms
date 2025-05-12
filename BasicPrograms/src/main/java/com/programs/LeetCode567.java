package com.programs;

import java.util.HashMap;

public class LeetCode567 {

    static boolean checkInclusion(String s1, String s2) {

        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();
        for (char ch : s1.toCharArray())
            hashMap1.put(ch, hashMap1.getOrDefault(ch, 0) + 1);

        int winSize = s1.length();
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            hashMap2.put(ch, hashMap2.getOrDefault(ch, 0) + 1);

            if (i >= winSize) {
                char leftChar = s2.charAt(i - winSize);
                if (hashMap2.get(leftChar) == 1)
                    hashMap2.remove(leftChar);
                else hashMap2.put(leftChar, hashMap2.get(leftChar) - 1);
            }
            if (hashMap1.equals(hashMap2)) return true;

        }


        return false;
    }

    public static void main(String[] args) {
        String str1 = "ab", str2 = "eidbaooo";
        System.out.println(checkInclusion(str1, str2));
    }

}
