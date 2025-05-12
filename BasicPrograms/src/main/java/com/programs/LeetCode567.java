package com.programs;

import java.util.HashMap;

public class LeetCode567 {

    static boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        if (k < s2.length()) return false;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < k; i++) {
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }

        if (matches(arr1, arr2)) return true;

        for (int i = k; i < s2.length(); i++) {
            arr2[s2.charAt(i) - 'a']++;
            arr2[s2.charAt(i - k) - 'a']--;
            if (matches(arr1, arr2)) return true;
        }
        return false;
    }

    static boolean matches(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

//    static boolean checkInclusion(String s1, String s2) {
//
//        HashMap<Character, Integer> hashMap1 = new HashMap<>();
//        HashMap<Character, Integer> hashMap2 = new HashMap<>();
//        for (char ch : s1.toCharArray())
//            hashMap1.put(ch, hashMap1.getOrDefault(ch, 0) + 1);
//
//        int winSize = s1.length();
//        for (int i = 0; i < s2.length(); i++) {
//            char ch = s2.charAt(i);
//            hashMap2.put(ch, hashMap2.getOrDefault(ch, 0) + 1);
//
//            if (i >= winSize) {
//                char leftChar = s2.charAt(i - winSize);
//                if (hashMap2.get(leftChar) == 1)
//                    hashMap2.remove(leftChar);
//                else hashMap2.put(leftChar, hashMap2.get(leftChar) - 1);
//            }
//            if (hashMap1.equals(hashMap2)) return true;
//
//        }
//
//
//        return false;
//    }

    public static void main(String[] args) {
        String str1 = "ab", str2 = "eidbaooo";
        System.out.println(checkInclusion(str1, str2));
    }

}
