package com.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {

    public static String getFreq(String string) {
        int[] freq = new int[26];
        for (int i = 0; i < string.length(); i++) {
            freq[string.charAt(i) - 'a']++;
        }

        char ch = 'a';
        StringBuilder stringBuilder = new StringBuilder("");
        for (int val : freq) {
            stringBuilder.append(val);
            stringBuilder.append(ch);
            ch++;
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};

        HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();

        for (int i = 0; i < arr.length; i++) {
            String freq = getFreq(arr[i]);
            if (hashMap.containsKey(freq)) {
                hashMap.get(freq).add(arr[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(arr[i]);
                hashMap.put(freq, list);
            }
        }

        System.out.println(hashMap.values());

    }

}
