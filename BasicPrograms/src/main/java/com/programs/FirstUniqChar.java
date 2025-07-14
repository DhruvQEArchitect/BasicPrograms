package com.programs;

import java.util.*;

public class FirstUniqChar {

    static int firstUniqChar(String s) {
        HashMap<Character, Integer> hashMap = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt((i)), hashMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (Character value : hashMap.keySet()) {
            if (hashMap.get(value).equals(1)) {
                return s.indexOf(value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }


}
