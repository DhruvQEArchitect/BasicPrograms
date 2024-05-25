package com.programs;

import java.util.HashMap;
import java.util.Map;

public class FrequencyString {

    public static void main(String[] args) {
        String str = "aabbcddddddeee";
        char[] ch = str.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (hashMap.containsKey(ch[i])) {
                hashMap.put(ch[i], hashMap.get(ch[i]) + 1);
            } else {
                hashMap.put(ch[i], 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue());
        }

    }
}
