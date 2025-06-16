package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode438 {

    static List<Integer> findAnagrams(String s, String p) {
        char[] ch1 = p.toCharArray();
        char[] ch2 = s.toCharArray();

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < p.length(); i++) {
            freq1[ch1[i] - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            freq2[ch2[i] - 'a']++;

            if (i >= p.length()) {
                freq2[ch2[i - p.length()] - 'a']--;
            }

            if (Arrays.equals(freq2, freq1)) {
                resultList.add(i - p.length() + 1);
            }
        }

        return resultList;
    }

    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc"));
    }
}
