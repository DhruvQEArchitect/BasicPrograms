package com.neetcode;


import java.util.HashMap;

//minimum window substring
public class NeetCode19 {

    static String minWindow(String s, String t) {
        String ans = "";
        HashMap<Character, Integer> hashMap2 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            hashMap2.put(ch, hashMap2.getOrDefault(ch, 0) + 1);
        }

        int i = -1, j = -1;
        int matchedCount = 0, desiredCount = t.length();

        HashMap<Character, Integer> hashMap1 = new HashMap<>();

        while (true) {
            boolean flag1 = false, flag2 = false;
            while (i < s.length() - 1 && matchedCount < desiredCount) {
                i++;
                char ch = s.charAt(i);
                hashMap1.put(ch, hashMap1.getOrDefault(ch, 0) + 1);
                if (hashMap1.getOrDefault(ch, 0) <= hashMap2.getOrDefault(ch, 0)) {
                    matchedCount++;
                }
                flag1 = true;
            }
            while (j < i && matchedCount == desiredCount) {
                String potentialAns = s.substring(j + 1, i + 1);
                if (ans.length() == 0 || potentialAns.length() < ans.length()) {
                    ans = potentialAns;
                }
                j++;
                char ch = s.charAt(j);
                if (hashMap1.get(ch) == 1)
                    hashMap1.remove(ch);
                else {
                    hashMap1.put(ch, hashMap1.get(ch) - 1);
                }

                if (hashMap1.getOrDefault(ch, 0) < hashMap2.getOrDefault(ch, 0)) {
                    matchedCount--;
                }
                flag2 = true;
            }

            if (flag1 == false && flag2 == false)
                break;

        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minWindow("OUZODYXAZV", "XYZ"));
    }
}
