package com.neetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class NeetCode4 {


    static String getFrequency(String string) {
        char[] ch = string.toCharArray();
        char c = 'a';
        StringBuilder stringBuilder = new StringBuilder("");
        int[] freq = new int[26];
        for (int i = 0; i < ch.length; i++) {
            freq[ch[i] - 'a']++;
        }

        for (int val : freq) {
            stringBuilder.append(c);
            stringBuilder.append(val);
            c++;
        }
        return stringBuilder.toString();
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();
        for (int i = 0; i < strs.length; i++) {
            String freq = getFrequency(strs[i]);
            if (hashMap.containsKey(freq)) {
                hashMap.get(freq).add(strs[i]);

            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                hashMap.put(freq, list);
            }
        }
        Collection<List<String>> listCollection = hashMap.values();
        return new ArrayList<>(listCollection);

    }

    public static void main(String[] args) {
        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};
        System.out.println(groupAnagrams(strs));
    }

}
